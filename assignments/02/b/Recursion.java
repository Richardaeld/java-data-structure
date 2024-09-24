// Name:       Richard Eldridge
// Class:      CS 3305 W03
// Term:       Spring 2024
// Instructor: Carla McManus
// Assignment: 2 - Part 2 Recursion
// IDE:        IntelliJ IDEA Edu



//Pseudo Code
// *Recursive method*
// Static Method Name: factorial -- Outputs: void -- Inputs: int(user input), int (call)
//  IFBEGIN input == 0
//      Return
//  IFEND


//  Create space required on each output as String(space)
//  OUTPUT space + "This was written by call number " + call + ".\n"
//  call recursion: with params(input -1 and call + 1)
//  OUTPUT space + "This was ALSO written by call number " + call + ".\n"

// *Main*
// PRINT "Enter a integer for total recursive calls: "
// call recursion: with params (user input AND call number)
//Pseudo Code END


import java.util.*;
public class Recursion {
    static void recursion (int input, int call) {
//      ---Base case
        if (input == 0) return;

//      ---Recursive case
//      Create spaces for output
        String space = "";
        for (int i = 1; i < call; i++) space += " ";
//      output text and make recursive call
        System.out.print(space + "This was written by call number " + call + ".\n");
        recursion(input - 1, call + 1);
        System.out.print(space + "This was ALSO written by call number " + call + ".\n");
    }


    public static void main(String[] args) {
//      Ask user for input
        System.out.print("Enter a integer for total recursive calls: ");
//      Take input as param and make initial call it recursive method
        recursion(new Scanner(System.in).nextInt(), 1);
    }
}