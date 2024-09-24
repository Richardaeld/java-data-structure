// Name:       Richard Eldridge
// Class:      CS 3305 W03
// Term:       Spring 2024
// Instructor: Carla McManus
// Assignment: 3 - Part 1 Iterator
// IDE:        IntelliJ IDEA Edu

//====================================
//=========== LinkedList =============
//====================================
//This is the stack that will collect all node
class LinkedList {
//  Declare Varialbes
    Node stack = new Node();

//  Prints the Range given to LinkedList
    void printRange(int x, int y) {
//      Declare variables
        Node stackTemp = stack;
        boolean bDisplay = false;
//      Iterates through all nodes depending upon if break statement
        while (stackTemp.next != null) {
            if (bDisplay  && stackTemp.nodeItem.getValue() == y) break;
            if (!bDisplay && stackTemp.nodeItem.getValue() == x) bDisplay = true;

//          Print if bDisplay is true
            if (bDisplay) System.out.print(stackTemp.nodeItem.getValue());
            stackTemp = stackTemp.next;
        }
//      Print last value if display values true
        if (bDisplay && stackTemp.nodeItem.getValue() != y) System.out.print(stackTemp.nodeItem.getValue());
        System.out.print("\n");
    }

//  Removes all repetitions withing LinkedLists linked list
    void removeRepetitions () {
//      Declare variables
        Node stackTemp = stack;
//      Iterates through all linkedList checking for duplicates and removing them
        while (stackTemp.next != null) {
            if (stackTemp.nodeItem.getValue() == stackTemp.next.nodeItem.getValue()) {
                stackTemp.next = (stackTemp.next.next == null) ? null : stackTemp.next.next;
            }
            stackTemp = stackTemp.next;
        }
    }

//  Adds Nodes to linkedList's linked list
    void addNode (int num) {
//      Declare variables
        Node stackTemp = stack;
        Node node      = new Node();
        node.nodeItem  = new NodeItem(num);

//      If first node null create this node
        if (stackTemp.nodeItem == null) {
            stack = node;
            return;
        }

//      Iterate through linkedList until end is reached and add in next node
        while (stackTemp.next != null) stackTemp = stackTemp.next;
        stackTemp.next = node;
    }

//  For viewing all nodes within linkedList's linked list
    void viewNodes () {
//      Declare variables
        Node stackTemp = stack;
//      While nodes exist in linkedList keep iterating over
        while (stackTemp.next != null) {
            System.out.print(stackTemp.nodeItem.getValue());
            stackTemp = stackTemp.next;
        }
    }
}


//====================================
//============== Node ================
//====================================
//Node to be added to linkedList
class Node {
    NodeItem nodeItem = null;
    Node next         = null;
}


//====================================
//============== NodeItem ================
//====================================
//Node item for insertion into Node which will be inserted into linkedList
class NodeItem {
    int value;
    NodeItem (int x) { value = x;    }
    int getValue ()  { return value; }
}


//====================================
//=+============ Iterator (Main) ================
//====================================
//Main class
public class Iterator {
    public static void main(String[] args) {
//      Variables
        int[] hardCode = {1, 1, 2, 3, 3, 4, 4, 5, 6, 7};
        LinkedList linkedList = new LinkedList();
//      Create linked list (linkedList)  and remove repetitions in linkedList
        for (int num: hardCode) { linkedList.addNode(num); }
        linkedList.removeRepetitions();
//      linkedList.viewNodes();

//      Print Ranges
        linkedList.printRange(2, 5);
        linkedList.printRange(2, 78);
        linkedList.printRange(2, 1);
        linkedList.printRange(8, 5);
    }
}