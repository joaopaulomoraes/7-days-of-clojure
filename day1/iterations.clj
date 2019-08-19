(ns seven-days-of-clojure.iterations)

(dotimes [i 7]
  (println i))

(doseq [n (range 3)]
  (println n))

(for [letter [:a :b]
      number (range 3)]
  [letter number])

(loop [i 0]
  (if (< i 10)
    (recur (inc i))
     i))
