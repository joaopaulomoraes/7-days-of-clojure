(ns seven-days-of-clojure.loop)

(loop [i 0]
  (if (< i 10)
    (recur (inc i))
    i))
