(ns user
  (:require [guestbook.handler :refer [app init destroy]]
            [luminus.http-server :as http]
            [guestbook.db.core :as db]
            [config.core :refer [env]]))

(defn start []
  (http/start {:handler app
               :init    init
               :port    (:port env)}))

(defn stop []
  (http/stop destroy))

(defn restart []
  (stop)
  (start))

; (db/get-messages)
; 
; (db/save-message! {:name "Bob"
;                    :message "Hello World"
;                    :timestamp (java.util.Date.)})
; 
