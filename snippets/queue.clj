(def e (clojure.lang.PersistentQueue/EMPTY))
(def q (reduce conj e (range 10)))
(peek q)
; 0
(peek (pop q))
; 1
(peek (pop (pop q)))
; 2
