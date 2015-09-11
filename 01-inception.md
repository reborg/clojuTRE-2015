## slides

* the piramid of knowledge adapted for people who will be aware of: 25% of the pearls in this talk, 50%, 75%, 100% to kick-off in a funny way
* slide explaining all the category of pearls in the talk: functions, vars, entire packages pearls (like clojure.core/doto)jk, hidden arities, undocumented functions
* first of all a definition: what standard library means? For me, it means your only dependency should be clojure itself, no other libraries. So require of other internal namespace is fine.
* dynamic *vars* are part of the standard library and influence a program in unexpected ways
* Carrying metaphore: find pictures and classification of real pearls. Use picture in each function slide and mimic something similar to a catalogue of pearls, using some of the rare ones for the most precious of my findings

## list of potential pearls or curious facts

### debugging

* destructure
* reductions

### mix

* clojure.test/with-test to allow testing in the function itself
* (clojure.pprint/cl-format nil "~:r" 1234) to print a number in english letters. Other examples here: http://www.gigamonkeys.com/book/a-few-format-recipes.html

### documentation

* (clojure.java.browse/browse-url "http://localhost:3000")
* (clojure.java.javadoc/javadoc "String") ; will open browser on javadoc for given object or type
* clojure.reflect/reflect (println (with-out-str (clojure.pprint/write (clojure.reflect/reflect :a))))
* (clojure.inspector/inspect-tree (range 10))

### performances
-----
* counted? reversible? do you want to know if the count or reverse operation you're about to do will take forever to execute?
* rseq: reversing a sequence in O(1) anyone?


* (clojure.set/rename-keys {:a 1, :b 2} {:a :new-a, :b :new-b})
* every? and the vacuous truth http://stackoverflow.com/questions/17461287/in-clojure-every-pred-coll-returns-true-if-coll-is-empty-could-this-be-a-de
* smart uses of fnil with identity: (((partial fnil identity) "default") blah)

## honorable mentions

* clojure.core/seque queue out of the box
* vector-of: stores unboxed version of one core type only. Use with ints, longs and so on
* gensym to generate unique symbol names in the current JVM
* munge and clojure.main/demunge  undocumented function that makes a string conformant to the Java specification for class names
* what can be used as a function in Clojure? All IFn descendant... are there surprises here? Like Symbols.
* ->as macro, with a placeholder for threaded operations
* clojure.data/diff
* ex-info, ex-data, handling exception the right way
* bean
* clojure.core/doto
* clojure.core - *print-length* to stop huge prints in the REPL
* map on multiple collections arguments
* butlast
* (= :a :b :c) instead of (and (= :a :b) (= :b :c))?
* not-empty with when-let to check on empty collections
* with-redefs and it's invaluable use in redeffing fns for testing
* group-by because it so versatile?
* clojure.core/cycle round-robin single liner
* max-key and min-key to find the smaller/biggest in a collection according to some rule f
* (when-not *compile-files*)
* alias (because it's a little unkown) if I can find a convincing example of something strange it can do
* vary-meta that alters metadata in a concise way
* make-hierarchy
