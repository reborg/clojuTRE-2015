(destructure '[[x y & others] v])

;; some cleanup, but essentially
[v2 v
 x (nth v2 0 nil)
 y (nth v2 1 nil)
 others (nthnext v2 2)]
