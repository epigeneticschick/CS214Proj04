;;;; Precondition: the input is a number that is of type double
;;;; Output: The factorial of the number
;;;; Lorrayya Williams February 25, 2019
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns factorial_n) ;Names the program

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;; factorial_n returns the factorial of the inputed number
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn  factorialn [number]
  (if (< number 2)
    1
    (* number  (factorialn (- number 1))
    )
    )
  )

  (defn -main []
   (println "To display a factorial,")
   (print "Enter a number: ") (flush)
   (let
      [ number (double (read))  ]
      (println)
      (println "The factorial of" number " is "(factorialn number))
     (println)
   )
  )
