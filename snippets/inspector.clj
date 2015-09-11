(require '[clojure.inspector :refer [inspect-tree]])
(def m {:a "a"
        :b {:c "c"
            :d [1 2 3]
            :e {:f "f"
                :g "g"
                :h "h"}}
        :i [1 2 3]
        :l {:m "m"
            :n "n"}
        :o [{:p "p" :q "q"}]})
(inspect-tree m)
