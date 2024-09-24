// Name:       Richard Eldridge
// Class:      CS 3305 W03
// Term:       Spring 2024
// Instructor: Carla McManus
// Assignment: 2 - Part 1 Factorial
// IDE:        IntelliJ IDEA Edu


//Pseudo Code
// *Recursive method*
// Static Method Name: factorial -- Outputs: int -- Inputs: int
//  IFBEGIN int < 0
//      Return Please enter a non-negative integer
//  ELSEIF int == 1 || int == 0
//      Base case, returns 1
//  ELSE
//      (Recursive call - 1) * int
//  IFEND

// *Main*
// PRINT "Enter a nonnegative integer: "
// INPUT user input int (iInput)
// call factorial with iInput params and capture results (results)
// IF results != 0
//      PRINT "Factorial of " + iInput + " is " + results
// IFEND
// OUTPUT
//Pseudo Code END

// Required import
import java.util.*;
//Main class
public class Factorial {
//  Recursive method
    static int factorial (int factorial) {
//      Error case with println
        if (factorial < 0) {
            System.out.println("Please enter a non-negative integer");
            return 0;
//      base case
        } else if (factorial == 1 || factorial == 0) {
            return 1;
//      normal recursive case
        } else {
            return factorial (factorial - 1) * factorial;
        }
    }
//  Main method
    public static void main(String[] args) {
//      STD out asking for user input
        System.out.print("Enter a nonnegative integer: ");

//      Retrieve user input as params for static method (factorial)
        int iInput  = new Scanner(System.in).nextInt();
        int results = factorial(iInput);

//      Display results if not 0, 0 is error case which already outputs
        if (results != 0) {
            System.out.println("Factorial of " +iInput + " is " + results);
        }
    }
}