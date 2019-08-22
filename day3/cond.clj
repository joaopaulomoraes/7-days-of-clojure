(ns seven-days-of-clojure.cond)

(cond
  (= 7 (inc 2)) false
  (= 16 (* 8 2)) true)

(cond
    (= 7 1) "1"
    (and (> 7 3) (< 7 10)) "7 is over 3 and under 10"
    :whatever-you-want "7 is other")
