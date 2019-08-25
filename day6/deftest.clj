(ns seven-days-of-clojure.deftest)

(deftest is-one-less-than-two
  (is (= 1 1)))

(deftest is-42-equals-42
  (is (= 42 42)))

(deftest is-number-different-from-string
  (is (= (not (= "13" 18)))))
