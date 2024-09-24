// Name:       Richard Eldridge
// Class:      CS 3305 W03
// Term:       Spring 2024
// Instructor: Carla McManus
// Assignment: 05-Part-1-Queues
// IDE:        IntelliJ IDEA Edu

//Import scanner and ArrayList
import java.util.*;


//================
//      No Chore
//================
//Throws exception when there are no chores remaining
class NoChore extends Exception {
    NoChore (String str) {
        super (str);
    }
}
//================
//      Chore
//================
//Node item (chore, holds chore name and priority)
class Chore {
    int priority;
    String name;
    Chore (int x, String str) {
        priority = x;
        name     = str;
    }
}

//================
//      Node
//================
//Node for linked list usage
class Node {
    Chore chore = null;
    Node next   = null;
}

//================
//      Stack
//================
//Stack for the LIkedlist
class Stack {
    Node top = null;

    //================
    //    add
    //================
    void add (int priority, String name) {
//        Create new node
        Node node = new Node();
        node.chore =  new Chore(priority, name);

//        If top null set to new node
        if (top == null) {
            top = node;
            return;
        }

//        Find Tail of LinkedList
        Node tempTop = top;
        while (tempTop.next != null) {
//            System.out.println(tempTop.next.chore.name);
            tempTop = tempTop.next;
        }

//        Set tail to new node
        tempTop.next = node;
    }

    //================
    //    View Chores
    //================
    void viewChores () throws NoChore {
        if (top == null) throw new NoChore("No chores are queued!");
//      Declare variables
        Node topTemp = top;

//      While nodes exist in stack keep iterating over
        while (topTemp.next != null) {
            System.out.println("Chore Name: " + topTemp.chore.name + " with priority: " + topTemp.chore.priority);
            topTemp = topTemp.next;
        }
        System.out.println("Chore Name: " + topTemp.chore.name + " with priority: " + topTemp.chore.priority);
    }
    //================
    //    Peek
    //================
    Node peek () throws NoChore {
//        exits if no chores
        if (top == null) throw new NoChore("No chores are queued!");

        Node nextChoreNode = top;
        Node tempTop = top;
//Searches for chore with highest priority
        while (tempTop.next != null) {
            if (nextChoreNode.chore.priority < tempTop.chore.priority) nextChoreNode = tempTop;
            tempTop = tempTop.next;
        }
        if (nextChoreNode.chore.priority < tempTop.chore.priority) nextChoreNode = tempTop;
//        returns chore
        return nextChoreNode;
    }

    //================
    //    remove
    //================
    Chore remove (Node choreNode) throws NoChore {
        Node tempTop = top;
        Node prevNode = null;
//  cathces and returns top node if its the highest priority
        if (tempTop.equals(choreNode)) {
            top = (tempTop.next != null) ? tempTop.next : null;
            return choreNode.chore;
        }

//        Searches for node with highest priority
        while (tempTop.next != null) {
            if (tempTop.equals(choreNode)){
                if (tempTop.next != null) {
                    System.out.println(tempTop.chore.name);
                    prevNode.next = tempTop.next;
                } else {
                    tempTop = null;
                }
                return choreNode.chore;
            }
            prevNode = tempTop;
            tempTop  = tempTop.next;
        }
//        returns last node if highest prioirity
        if (tempTop.equals(choreNode)) {
            prevNode.next = null;
            return choreNode.chore;
        }
//        Error catch, assume no node for chore
        throw new NoChore("No chores are queued!");
    }
}

public class Queues {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);

        boolean bRun = true;
        int    iInput;
// Program loop
        while (bRun) {
            String sInput = "";
//            INPUT (for user selection)
//            Add Chore
//            View Next Chore
//            View Chores
//            Complete Chore
            System.out.println("1.Add Chore");
            System.out.println("2.View Next Chore");
            System.out.println("3.View Chores");
            System.out.println("4.Complete Chore");
            try {
//                Switch case for user selection
                switch (sc.nextInt()) {
//                    Add chore
                    case 1:
                        System.out.println("What is the Chore's name");
                        sInput += sc.nextLine();
                        sInput += sc.nextLine();
                        System.out.println("What is the Chore's priority?");
                        iInput = sc.nextInt();
                        if (iInput < 0) {
                            iInput = Math.abs(iInput);
                            System.out.println("This negative value priority will be stored as " + iInput);
                        }
                        stack.add(iInput, sInput); break;
//                   Peek chore of highest priority
                    case 2:
                        Node nextChore = stack.peek();
                        System.out.println("The next chore is " + nextChore.chore.name + " with a priority of " + nextChore.chore.priority);
                        break;
//                    view all remaining chores
                    case 3:
                        stack.viewChores(); break;
//                    Remove chore of highest priority
                    case 4:
                        Chore chore = stack.remove(stack.peek());
                        System.out.println("You completed: " + chore.name); break;
//                    Error handling
                    default:
                        System.out.println("Please enter a number 1-4");
                }
//                No chore error handling
            } catch (NoChore e) {
                System.out.println("No Chores remaining!");
//                generic error handling
            } catch (Exception e) {
                System.out.println("Please enter a number 1-4*");
                sc.nextLine();
            }
            System.out.println();
        }
    }
}