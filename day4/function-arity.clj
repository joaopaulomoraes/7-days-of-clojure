(ns seven-days-of-clojure.function-arity)

(defn no-params
  []
  "I take no parameters!")

(defn one-param
  [p]
  (str "I take one parameter: " p))

(defn two-params
  [p1 p2]
  (str "Two parameters! " p1 " and " p2))

(defn multi-arity
  ([first-arg second-arg third-arg]
     (do-things first-arg second-arg third-arg))
  ([first-arg second-arg]
     (do-things first-arg second-arg))
  ([first-arg]
     (do-things first-arg)))
