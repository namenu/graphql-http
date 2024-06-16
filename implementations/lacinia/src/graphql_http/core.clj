(ns graphql-http.core
  (:require [clojure.data.json :as json]
            [clojure.edn :as edn]
            [com.walmartlabs.lacinia :refer [execute]]
            [com.walmartlabs.lacinia.schema :as schema]
            [com.walmartlabs.lacinia.util :refer [inject-resolvers]]
            [muuntaja.core :as m]
            [muuntaja.format.json :as json-format]
            [reitit.ring :as ring]
            [reitit.ring.middleware.muuntaja :as muuntaja]
            [reitit.ring.middleware.parameters :refer [parameters-middleware]]
            [ring.adapter.jetty :as jetty]))

(defn get-hero
  [context arguments value]
  (let [{:keys [episode]} arguments]
    (if (= episode :NEWHOPE)
      {:id         1000
       :name       "Luke"
       :homePlanet "Tatooine"
       :appearsIn  ["NEWHOPE" "EMPIRE" "JEDI"]}
      {:id         2000
       :name       "Lando Calrissian"
       :homePlanet "Socorro"
       :appearsIn  ["EMPIRE" "JEDI"]})))

(def star-wars-schema
  (-> "schema.edn"
      slurp
      edn/read-string
      (inject-resolvers {:Query/hero  get-hero
                         :Query/droid (constantly {})})
      schema/compile))

(defn handle-get [request]
  {:status  200
   :headers {"Content-Type" "application/json"}
   :body    (let [query  (get-in request [:query-params :query])
                  result (execute star-wars-schema query nil nil)]
              (json/write-str result))})

(defn handle-post [request]
  (let [header-accept (get-in request [:headers "accept"])
        content-type  (cond
                        (= header-accept "application/graphql-response+json") "application/graphql-response+json"
                        :else "application/json")]
    (prn header-accept)
    {:status  200
     :headers {"Content-Type" content-type}
     :body    (let [query     (get-in request [:body-params :query])
                    variables (get-in request [:body-params :variables])
                    result    (execute star-wars-schema query variables nil)]
                (json/write-str result))}))

(def muuntaja
  (m/create
    (assoc-in
      m/default-options
      [:formats "application/graphql-response+json"]
      {:decoder [json-format/decoder {:decode-key-fn true}]
       :encoder [json-format/encoder]})))

(def router
  (ring/router
    ["/graphql" {:get  {:handler    #'handle-get
                        :middleware [parameters-middleware]}
                 :post {:handler #'handle-post}}]

    {:data {:muuntaja   muuntaja
            :middleware [muuntaja/format-middleware]}}))

(def app
  (ring/ring-handler router))

(defn -main
  "Starts the Jetty server."
  [& args]
  (jetty/run-jetty #'app {:port  3000
                          :join? false}))

(comment
  (-main))
