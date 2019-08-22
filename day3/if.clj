(ns seven-days-of-clojure.if)

(if true
  :truthy
  :falsey)

(if (> 3 2)
  "Higher"
  "Lower")

(if false
  (println "two"))

(if (odd? 41)
    (inc 42)
    42)

(if true
  (do (println "Nice!")
      "Another nice expression!")
  (do (println "Boring!")
      "A boring expression!"))
