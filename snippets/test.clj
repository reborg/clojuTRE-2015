(defn add+
 {:test #(do
     (assert (= (add+ 2 3) 5))
     (assert (= (add+ 4 4) 8)))}
  [x y] (+ x y))

(test #’add+)
