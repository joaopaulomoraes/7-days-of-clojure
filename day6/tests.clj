(ns seven-days-of-clojure.tests
  (:require [clojure.test :refer :all]
            [seven-days-of-clojure.some-functions :refer :all]))

(deftest one-test
  (testing "Should return 1."
    (is (= 1 (seven-days-of-clojure.some-functions/one)))))

(deftest floating-point-test
  (testing "Should return 7.7."
    (is (= 7.7 (seven-days-of-clojure.some-functions/floating-point)))))

(deftest language-test
  (testing "Should return Clojure."
    (is (= "Clojure" (seven-days-of-clojure.some-functions/language)))))

(deftest is-bool-test
  (testing "Should return true."
    (is (= true (seven-days-of-clojure.some-functions/is-bool)))))

(deftest author-test
  (testing "Shoud return an author {:id, :name, :email}."
    (is (= {:id "id-01"
            :name "author"
            :email "author@clj.map"} (seven-days-of-clojure.some-functions/author)))))

(deftest paradigm-test
  (testing "Should return :fp."
    (is (= :fp (seven-days-of-clojure.some-functions/paradigm)))))
