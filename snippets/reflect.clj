(require '[clojure.reflect :refer [reflect]])
(println (with-out-str (clojure.pprint/write (reflect :a))))
;; extract from a typical output
{:name invoke,
 :return-type java.lang.Object,
 :declaring-class clojure.lang.Keyword,
 :parameter-types [java.lang.Object],
 :exception-types [],
 :flags #{:public :final}}
