(ns seven-days-of-clojure.for)

(for [letter [:a :b]
  number (range 3)]
    [letter number])


(for [x (range) :while (< x 10) 
  y (range) :while (<= y x)]
    [x y])