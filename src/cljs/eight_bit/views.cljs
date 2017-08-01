(ns eight-bit.views
  (:require [re-frame.core :as re-frame]
            [domina.core :refer [by-id set-styles!]]))

(def nes-pallete
  ["#7C7C7C"
   "#0000FC"
   "#0000BC"
   "#4428BC"
   "#940084"
   "#A80020"
   "#A81000"
   "#881400"
   "#503000"
   "#007800"
   "#006800"
   "#005800"
   "#004058"
   "#000000"
   "#000000"
   "#000000"
   "#BCBCBC"
   "#0078F8"
   "#0058F8"
   "#6844FC"
   "#D800CC"
   "#E40058"
   "#F83800"
   "#E45C10"
   "#AC7C00"
   "#00B800"
   "#00A800"
   "#00A844"
   "#008888"
   "#000000"
   "#000000"
   "#000000"
   "#F8F8F8"
   "#3CBCFC"
   "#6888FC"
   "#9878F8"
   "#F878F8"
   "#F85898"
   "#F87858"
   "#FCA044"
   "#F8B800"
   "#B8F818"
   "#58D854"
   "#58F898"
   "#00E8D8"
   "#787878"
   "#000000"
   "#000000"
   "#FCFCFC"
   "#A4E4FC"
   "#B8B8F8"
   "#D8B8F8"
   "#F8B8F8"
   "#F8A4C0"
   "#F0D0B0"
   "#FCE0A8"
   "#F8D878"
   "#D8F878"
   "#B8F8B8"
   "#B8F8D8"
   "#00FCFC"
   "#F8D8F8"
   "#000000"
   "#000000"])

(defn make-column []
  (let [id (gensym)]
    [:td
     {:style {:background-color (rand-nth nes-pallete)}
      :id id
      :on-mouse-over #(set-styles! (by-id id) {:background-color (rand-nth nes-pallete)})}
     ""]))

(defn make-row [length]
  (into [:tr ] (take length (repeatedly #(make-column)))))

(defn make-table [x y]
  [:table
   (repeatedly x #(make-row y))])

(defn main-panel []
  (let [name (re-frame/subscribe [:name])]
    (fn []
      [:div.container
       (make-table 50 100)
       ])))
