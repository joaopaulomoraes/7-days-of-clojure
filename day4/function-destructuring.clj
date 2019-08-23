(ns seven-days-of-clojure.function-destructuring)

(defn first-element
  [[first-thing]]
    first-thing)

(defn location
  [{lat :lat lng :lng}]
    (println (str "lat: " lat))
    (println (str "lng: " lng)))
