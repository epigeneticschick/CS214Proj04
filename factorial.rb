#! /usr/bin/ruby
# factorial.rb displays a factorial
#Lorrayya Williams for CS 214 at Calvin College
#
# Input:  A number
# Precondition: The input must be a number
# Output: A factorial of the inputed number
if __FILE__ == $0
  print "Enter the number you wish to see a factorial of "
 number = gets.to_f
 value = number
 original_num = number

 #change to for loop
for i in 2..original_num do
    value -= 1
    number *= value
  end
puts "The factorial of #{original_num} is #{number}."
end
