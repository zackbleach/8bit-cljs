(ns eight-bit.css
  (:require [garden.def :refer [defstyles]]))

(defstyles screen
  [:div.container {:display "table-cell"
                   :width "100vw"
                   }]
  [:div.name {:position "absolute"
              :width "100vw"
              :top "200px"
              :z-index "1000"
              :color "white"
              :font-size "14px"}]
  [:body {:background-color "black"}]
  [:table {:padding-top "30px"
           :border-spacing "0px"
           :margin  "0 auto"}]
  [:td {:padding "5px"}])
