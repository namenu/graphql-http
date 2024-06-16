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
    (let [res  (http/post "http://localhost:3000/graphql"
                          {:body         (json/write-str {:query "{ __typename }"})
                           :content-type :json
                           :accept       :json})
          body (json/read-str (:body res) :key-fn keyword)]
      (is (= 200 (:status res)))
      (is (= nil (:errors body))))))

(deftest test-28B9
  (testing "MUST allow map {variables} parameter when accepting application/json"
    (let [query "query Type($name: String!) { __type(name: $name) { name } }"
          res   (http/post "http://localhost:3000/graphql"
                           {:body         (json/write-str {:query     query
                                                           :variables {:name "someType"}})
                            :content-type :json
                            :accept       :json})
          body  (json/read-str (:body res) :key-fn keyword)]
      (is (= 200 (:status res)))
      (is (= nil (:errors body))))))

(deftest test-22EB
  (testing "SHOULD accept application/graphql-response+json and match the content-type"
    (let [res (http/post "http://localhost:3000/graphql"
                         {:body         (json/write-str {:query "{ __typename }"})
                          :content-type :json
                          :accept       "application/graphql-response+json"})]
      (is (= 200 (:status res)))
      (is (= "application/graphql-response+json" (get-in res [:headers "content-type"]))))))

  (comment
    (test-4655)
    (test-13EE)
    (test-28B9)
    (test-22EB)
    )
