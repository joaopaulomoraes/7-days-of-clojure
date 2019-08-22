(ns seven-days-of-clojure.recur)

(defn fibo-recursive
  [n]
    (if (or (= n 0) (= n 1))
      n
        (+ (fibo-recursive (- n 1)) (fibo-recursive (- n 2)))))

(fibo-recursive 6)

;; recurr
(defn fib-with-recur [n]
  (if (> n 1)
    (loop [x (- n 2)
            v [0 1]]
      (if (> x 0)
        (recur (dec x) (conj v (+ (peek v) (peek (pop v)))))
        v))
    [0]))

(fib-with-recur 7)

;; loop
(loop [i 0]
  (if (< i 10)
    (recur (inc i))
    i))
