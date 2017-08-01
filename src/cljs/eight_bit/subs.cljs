(ns eight-bit.subs
    (:require-macros [reagent.ratom :refer [reaction]])
    (:require [re-frame.core :as re-frame]))

(re-frame/register-sub
 :table
 (fn [db]
   (reaction (:table @db))))
