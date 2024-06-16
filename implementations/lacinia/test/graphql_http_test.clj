(ns graphql-http-test
  (:require [clojure.test :refer :all]
            [clojure.data.json :as json]
            [clj-http.client :as http]))


(deftest test-4655
  (testing "4655 MUST accept application/json and match the content-type"
    (let [res (http/post "http://localhost:3000/graphql"
                         {:body         (json/write-str {:query "{ __typename }"})
                          :content-type :json
                          :accept       :json})]
      (is (= 200 (:status res)))
      (is (= "application/json" (get-in res [:headers "content-type"]))))))

(deftest test-13EE
  (testing "MUST allow string {query} parameter when accepting application/json"
    (let [res (http/post "http://localhost:3000/graphql"
                         {:body         (json/write-str {:query "{ __typename }"})
                          :content-type :json
                          :accept       :json})]
      (is (= 200 (:status res)))
      (is (= nil (get-in res [:body :errors]))))))

(comment
  (test-4655)
  (test-13EE)
  )
