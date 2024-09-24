// Name:       Richard Eldridge
// Class:      CS 3305 W03
// Term:       Spring 2024
// Instructor: Carla McManus
// Assignment: 07-Part-1-Sorting
// IDE:        IntelliJ IDEA Edu

import java.util.*;

//Item of Node
class Item {
    int number;
    Item (int x) { number = x; }
}

//Linked list node
class Node {
    Item item;
    Node next;
}

//Merge class for merge sorting
 class Merge {
     Node head = null;

//     Recursive sort
     Node mergeSort(Node left, Node right) {
        Node returnNode = null;
//        Base Case
        if (left == null) return right;
        if (right == null) return left;

//        Recursion for left/right
        if (left.item.number <= right.item.number) {
            returnNode = left;
            returnNode.next = mergeSort(left.next, right);
        } else {
            returnNode = right;
            returnNode.next = mergeSort(left, right.next);
        }
        return returnNode;
     }

//    Recursive sort
    Node mergeSort(Node node) {
//        Base Case
        if (node == null || node.next == null) return node;

//        Find Middle/middleNext
        Node middle = returnMiddle(node);
        Node middleNext = middle.next;
        middle.next = null;

//        Sort left/right lists
        Node left = mergeSort(node);
        Node right = mergeSort(middleNext);

//        Merge the left and right lists
        return mergeSort(left, right);
    }


     public static Node returnMiddle(Node head) {
         if (head == null) return head;
         Node
            left = head,
            right = head;

//         Find middle of left/right
        while (right.next != null && right.next.next != null) {
            left = left.next;
            right = right.next.next;
        }
        return left;
     }

     void push(int number) {
//        Create new Node
        Node node = new Node();
        node.item = new Item(number);

//        Add new node and reset head
        node.next = head;
        head = node;
     }

//     toString that accepts a Node
     String toStringLinkedList(Node headTemp) {
         String rString = "";
         while (headTemp != null) {
             rString += headTemp.item.number + " ";
             headTemp = headTemp.next;
         }
         return rString;
     }
 }

 public class Sorting {
    public static void main(String[] args) {
        Merge merge = new Merge();
//        Hardcoded array for sorting
        int[] numbers = {1009,21,3,55,2022,24,99,501,105,98,178,245,0,3305,990,76,373,1010,642,777};

//        Print original array
        System.out.println("\nOriginal Array: ");
        for (int num: numbers) System.out.print(num + " ");
        System.out.println();

//        Insert array into merge Linkedlist
        for(int num: numbers) merge.push(num);

//        Sort LinkedList and print
        merge.head = merge.mergeSort(merge.head);
        System.out.println("\nThis is the merge sorted Array: \n" + merge.toStringLinkedList(merge.head));

    }
}


