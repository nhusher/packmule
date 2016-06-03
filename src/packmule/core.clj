(ns packmule.core
  (:require [liberator.core :as c]
            [environ.core :refer [env]]
            [monger.core :as mg]
            [monger.collection :as mc])
  (:import org.bson.types.ObjectId))


(defn -main [& args]
  (let [conn (mg/connect {:host "database"})
        db   (mg/get-db conn "monger-test")]
    (mc/insert db "documents" { :_id (ObjectId.) :first_name "John" :last_name "Lennon" })))
