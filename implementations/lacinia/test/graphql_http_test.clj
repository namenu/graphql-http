(ns graphql-http-test
  (:require [clojure.test :refer :all]
            [clj-http.client :as http]))


(deftest test-4655
  (testing "4655 MUST accept application/json and match the content-type"
    (let [res (http/post "http://localhost:3000/graphql"
                         {:body         "{}" #_{:query "{ __typename }"}
                          :content-type :json
                          :accept       :json})]
      (is (= 200 (:status res)))
      (is (= "application/json" (get-in res [:headers "content-type"]))))))

(test-4655)