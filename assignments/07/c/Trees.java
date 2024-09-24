// Name:       Richard Eldridge
// Class:      CS 3305 W03
// Term:       Spring 2024
// Instructor: Carla McManus
// Assignment: 07-Part-3-Bonus-Trees
// IDE:        IntelliJ IDEA Edu


// CASE I (index starts on 0):
// Left child [(2*i) + 1]
// right child [(2*i) + 2]
// Parent [(i-1)/2]

// CASE II (index starts on 1): // USING CASE II!!
// Left child (2*i)
// right child [(2*i) + 1]
// parent [i/2]


import java.util.*;
import java.io.*;

class Node {
    String string = null;

    Node () {}
    Node (String str) {string = str;}
}

class MorseCode {
//    import Morse code BTree
    ArrayList<Node> key = new ArrayList<>();



    MorseCode () {
        try {
//            Import file and load into scanner
            File file = new File("morse.txt");
            if (!file.exists()) throw new Exception("File does not exist");
            Scanner sc = new Scanner(file);

//            import information from file
            while (sc.hasNextLine()) {
                key.add(new Node(sc.nextLine()));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


//    Determine if dot or dash
    Boolean isLeft(int index) {
        if (index == 1) return true;
        if (index == 2) return false;

        int parent = index / 2;

        return (parent * 2 == index) ? true : false;
    }



    //    // find all parents
    ArrayList<Integer> findParents (String str) {
        ArrayList<Integer> path = new ArrayList<>();
        int index = (int) findIndex(str);

        do {
            System.out.println("t: " + index);
            path.add(index);
            if (index == 0) break;
            if (index == 1) break;
            if (index == 2) break;
            index /= 2;
//            path.add(index);
        } while(index != 0 || index != 1 || index != 2);

//        for ()

        return path;
    }

//    Find index of character
    int findIndex (String str) {
        int counter = 0;
        for(Node node: key){
            if (node.string.equals(str)) break;
            counter++;
        }
        System.out.println("counter: " + counter);
        return counter;
    }



//    // Encode
    String encode (String input) {
        ArrayList<Integer> parents = findParents(input);

//        return parent indexes
        for (int num: parents) {
            System.out.println(num);
        }

        return input;

    }


//}
// Decode
// safely assume no incorrect input
// if . left
// if - right
}

public class Trees {
    public static void main(String[] args) {

//        Create morsecode object
        MorseCode morseCode = new MorseCode();

//        test case
        morseCode.encode("g");

    }
}