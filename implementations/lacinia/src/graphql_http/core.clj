(ns graphql-http.core
  (:require [clojure.data.json :as json]
            [clojure.edn :as edn]
            [com.walmartlabs.lacinia :refer [execute]]
            [com.walmartlabs.lacinia.schema :as schema]
            [com.walmartlabs.lacinia.util :refer [inject-resolvers]]
            [muuntaja.core :as m]
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
                  _      (clojure.pprint/pprint (:query-params request))
                  result (execute star-wars-schema query nil nil)]
              (json/write-str result))})

(defn handle-post [request]
  {:status 200
   :headers {"Content-Type" "application/json"}})

(def router
  (ring/router
    ["/graphql" {:get  {:handler    #'handle-get
                        :middleware [parameters-middleware]}
                 :post {:handler #'handle-post}}]

    {:data {:muuntaja m/instance
            :middleware [muuntaja/format-middleware]}}
    ))

(def app
  (ring/ring-handler router))

(defn -main
  "Starts the Jetty server."
  [& args]
  (jetty/run-jetty #'app {:port  3000
                          :join? false}))

(comment
  (-main))
