(ns seven-days-of-clojure.closures)

(defn inc-maker
  "Create a custom incrementor"
  [inc-by]
    #(+ % inc-by))

;; (def inc3 (inc-maker 3))
;; (inc3 7)

(defn inner
  [from-outer]
    (fn [] (println from-outer)))

(def fn1 (inner "this is from fn1"))

(def fn2 (inner "this is yet another from fn2"))
