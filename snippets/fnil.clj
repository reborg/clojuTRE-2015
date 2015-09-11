(def m {:host "127.0.0.1" :port nil})
(update m :port (fnil #(Integer/parseInt %) "80"))
; {:port 80, :host "http://localhost"}
(def m {:host "127.0.0.1" :port "8008"})
(update m :port (fnil #(Integer/parseInt %) "80"))
; {:port 8008, :host "http://localhost"}
