(ns seven-days-of-clojure.flux-control)

(if true
  :truthy
  :falsey)

(if (= (+ 1 1) 2)
  "Then true"
  "Opitional else value")

(let [x 7]
  (cond
    (< x 2) "x is less than 2"
    (< x 10) "x is less than 10"))

(let [x 14]
  (cond
    (< x 2)  "x is less than 2"
    (< x 10) "x is less than 10"
    :else  "x is greater than or equal to 14"))

(when true
  (println "Success!")
  "Awesome too!")

(defn foo
  [c]
    (case c
      5 "c is 5"
      10 "c is 10"))

(defn foo
  [c]
    (case c
      5 "c is 5"
      10 "c is 10"
      "c isn't 5 or 10"))
