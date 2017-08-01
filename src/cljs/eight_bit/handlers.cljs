(ns eight-bit.handlers
    (:require [re-frame.core :as re-frame]
              [eight-bit.db :as db]))

(re-frame/register-handler
 :initialize-db
 (fn  [_ _]
   db/default-db))
