// Name:       Richard Eldridge
// Class:      CS 3305 W03
// Term:       Spring 2024
// Instructor: Carla McManus
// Assignment: 07-Part-2-Heaps
// IDE:        IntelliJ IDEA Edu

import java.util.*;

class Heap<E extends Comparable<E>> {
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();

    /** Create a default heap */
    public Heap() {}

    /** Create a heap from an array of objects */
    public Heap(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            add(objects[i]);
    }

    /** Add a new object into the heap */
    public void add(E newObject) {
        list.add(newObject); // Append to the heap
        int currentIndex = list.size() - 1; // The index of the last node
        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;
// Swap if the current object is greater than its parent
            if (list.get(currentIndex).compareTo(list.get(parentIndex)) < 0) {
                E temp = list.get(currentIndex);
                list.set(currentIndex, list.get(parentIndex));
                list.set(parentIndex, temp);
            }
            else
                break; // The tree is a heap now
            currentIndex = parentIndex;
        }
    }

    /** Remove the root from the heap */
    public E remove() {
        if (list.size() == 0) return null;
        E removedObject = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.remove(list.size() - 1);
        int currentIndex = 0;
        while (currentIndex < list.size()) {
            int leftChildIndex = 2 * currentIndex + 1;
            int rightChildIndex = 2 * currentIndex + 2;

// Find the maximum between two children
            if (leftChildIndex >= list.size()) break; // The tree is a heap
            int maxIndex = leftChildIndex;
            if (rightChildIndex < list.size()) {
                if (list.get(maxIndex).compareTo(
                    list.get(rightChildIndex)) > 0) {
                    maxIndex = rightChildIndex;
                }
            }

// Swap if the current node is less than the maximum
            if (list.get(currentIndex).compareTo(list.get(maxIndex)) > 0) {
                E temp = list.get(maxIndex);
                list.set(maxIndex, list.get(currentIndex));
                list.set(currentIndex, temp);
                currentIndex = maxIndex;
            } else {
                break; // The tree is a heap
            }

        }
        return removedObject;
    }
/** Get the number of nodes in the tree */
    public int getSize() {
        return list.size();
    }

//    Override for toString to print out heap
    public String toString () {
        String sReturn = "";
        for (E number: list) {
            sReturn += number + " ";
        }
        return sReturn;
    }
}


public class Heaps {
    public static void main(String[] args) {
//        Instantiate Heap and Scanner classes
        Heap heap = new Heap();
        Scanner sc = new Scanner(System.in);

//        Ask user for input and take in input
        System.out.println("Enter 5 numbers to sort using a heap");
        while (heap.getSize() < 5) heap.add(sc.nextInt());

//        print out original heap
        System.out.println("\nInputs are:");
        System.out.println(heap.toString() + "\n");

//        Remove and print heap until entire heal has been removed
        System.out.println("Remove one number at a time until heap is depleted");
        while(heap.getSize() > 0) {
            heap.remove();
            System.out.println(heap.toString());
        }

    }
}