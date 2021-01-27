(ns fp.Konwertowanieliczby)

(defn Konwertowanie [liczba]
  ((println "Liczba BIN: "(Integer/toBinaryString liczba))
   (println "Liczba OCT: "(Integer/toOctalString liczba))
   ((println "Liczba HEX: "(Integer/toHexString liczba)))))

(def konwertuj
  ((println "Podaj liczbe do przekonwertowania: ")
   (def liczba (Integer/parseInt (read-line)))
   (Konwertowanie liczba)))
(konwertuj)