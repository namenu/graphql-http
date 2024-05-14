(ns graphql-http.core
  (:require [clojure.data.json :as json]
            [clojure.edn :as edn]
            [ring.adapter.jetty :as jetty]
            [com.walmartlabs.lacinia :refer [execute]]
            [com.walmartlabs.lacinia.schema :as schema]
            [com.walmartlabs.lacinia.util :refer [inject-resolvers]]))

(defn get-hero
  [context arguments value]
  (let [{:keys [episode]} arguments]
    (if (= episode :NEWHOPE)
      {:id 1000
       :name "Luke"
       :homePlanet "Tatooine"
       :appearsIn ["NEWHOPE" "EMPIRE" "JEDI"]}
      {:id 2000
       :name "Lando Calrissian"
       :homePlanet "Socorro"
       :appearsIn ["EMPIRE" "JEDI"]})))

(def star-wars-schema
  (-> "schema.edn"
      slurp
      edn/read-string
      (inject-resolvers {:Query/hero get-hero
                         :Query/droid (constantly {})})
      schema/compile))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "application/json"}
   :body (let [query (get-in request [:query-params :query])
               result (execute star-wars-schema query nil nil)]
           (json/write-str result))})

(comment
  (jetty/run-jetty handler {:port  3000
                            :join? false}))
