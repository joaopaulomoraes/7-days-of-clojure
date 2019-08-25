(ns seven-days-of-clojure.is)

(ns seven-days-of-clojure.tests
  (:use clojure.test))

(is (= 5 (+ 2 2)))

(is (= 7 (+ 3 4)))

(is (= false (> 49 7)) "False arithmetic test.")
