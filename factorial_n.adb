-- factorial_n.adb computes a factorial 
--
-- Input: A number
-- Precondition: The input must be a number.
-- Output: The Factorial of the inputed Number
-- Lorrayya Williams for CS 214 at Calvin College
-- February 28, 2019
--------------------------------------------------------------

with Ada.Text_IO, Ada.Float_Text_IO;
use  Ada.Text_IO, Ada.Float_Text_IO;
with Ada.Numerics.Elementary_Functions;
use Ada.Numerics.Elementary_Functions;

procedure Factorial_N is

   Number, I : Float;
   OriginalNum : Integer;


begin                                           -- Prompt for input
   Put_Line("To print a factorial");
   Put("Enter a Number: ");
   Get(Number); 
   
   I := Number;
   

   OriginalNum := Integer(Number);

For_Loop :
    for a in Integer  range 2  .. Integer(Number) loop
       I := I - 1.0;
       Number := Number *I;    
    end loop  For_Loop;
    
    Put("The factorial of");
    Put(Integer'Image(OriginalNum));
    Put(" is ");
    Put(Number);
    New_Line(1);
     
end Factorial_N ;
