(ns seven-days-of-clojure.function-body)

(defn another-function
  []
  (+ 1 13)
  21
  "function")

(defn greater-than-10
  [n]
  (if (> n 10)
    (str n " is greater than 10")
    (str n " is not greater than 10")))
