// Name:       Richard Eldridge
// Class:      CS 3305 W03
// Term:       Spring 2024
// Instructor: Carla McManus
// Assignment: 04-Part-2-Palindromes
// IDE:        IntelliJ IDEA Edu

// Imports scanner
import java.util.*;

//==============================
// Individual items in Node
//==============================
class Item {
    char character;
    Item        (char character) { this.character = character; }
    char charGet()               { return character;           }
}

//==============================
// Node for stack
//==============================
class Node {
    Item item = null;
    Node next = null;
}

//==============================
// Stacks -- linkedList
//==============================
class Stack {
    Node top = null;

//    Checks if stack (top) is empty
    boolean isEmpty () {
        return (top == null) ? true: false;
    }

//    Removes a char from the foot of the stack
    char pop () {
        Node topTemp = top;
        Node topTempPrev = null;

//        Iterate through till end
        while (topTemp.next != null) {
            topTempPrev = topTemp;
            topTemp = topTemp.next;
        }

//        Remove and Return last item
        if (topTempPrev != null) {
            topTempPrev.next = null;
        } else {
            top = null;
        }

//        return str at bottom of stack
        return topTemp.item.charGet();
    }

//    Adds a char to the foot of the stack
    void push (char character) {
        Node topTemp = top;
        Node node = new Node();
        node.item = new Item(character);

        if (topTemp == null) {
            top = node;
            return;
        }

        while (topTemp.next != null) {
            topTemp = topTemp.next;
        }

        topTemp.next = node;
    }

//    Override Needed to compare contents of linked list
//    Concats chars to String from stack and returns concatted string
    public String toString() {
        String concat = "";
        Node topTemp = top;

        if (top == null) return concat;

        while(topTemp.next != null) {
            concat += topTemp.item.charGet();
            topTemp = topTemp.next;
        }

        concat += topTemp.item.charGet();
        return concat;
    }
}
//==============================
// Main class
//==============================
public class Palindromes {
    public static void main(String[] args) {
//        Set variables
        Scanner sc = new Scanner(System.in);
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        Stack stack3 = new Stack();

//        Push userInput onto stack1 and stack2
        System.out.println("Enter a word to check if it is a palindrome");
        for (String str : sc.nextLine().split("")) {
            if (str.equals("")) break;
            stack2.push(str.charAt(0));
            stack1.push(str.charAt(0));
        }

//        Pop stack1 and push to stack3
        while (true) {
            if (stack1.isEmpty()) break;
            stack3.push(stack1.pop());
        }

//        Print conclusion (if userinput[string] was a palindrome)
        String conclusion = (stack2.toString().equals(stack3.toString()) && !stack3.isEmpty()) ? "is" : "is not";
        System.out.println("This " + conclusion + " a palindrome.");
    }
}