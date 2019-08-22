(ns seven-days-of-clojure.dotimes)

(dotimes [i 7]
  (println i))

(dotimes [y 5] 
  (println (map #(inc %) (range (inc y)))))
