/* factorial.java displays the facortial of a number
 *
 * Input: A number that is the type long
 * Output: The Factorial of a Number
 * Written by: Lorrayya Williams for CS 214 at Calvin College
 ********************************************************/
import java.util.Scanner; 		// Get input
class Factorial {

  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter Number you want factorial of");
    double n;
    n = keyboard.nextLong();

  double answer = 1.0;
  for(int i= 2; i<= n; i++){
    answer = answer * i;
  }
    System.out.println("The facotorial of " + n + " is " + answer);
}
}
