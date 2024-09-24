// Name:       Richard Eldridge
// Class:      CS 3305 W03
// Term:       Spring 2024
// Instructor: Carla McManus
// Assignment: 05-Part-2-Shoppers
// IDE:        IntelliJ IDEA Edu

import java.util.*;

//********************************
//    Customer
//********************************
//Node item
class Customer {
    int time;

    //================
//        Constructor
    //================
    Customer (int x) {
        time = x;
    }

    //================
//      to String
    //================
    public String toString() {
        return " " + time + " ";
    }
}

//********************************
//    Check Out Line
//********************************
//Node/stack for 'queue'
class CheckOut {
    ArrayList<Customer> line = new ArrayList<>();
    CheckOut (int x) {
        line.add(new Customer(x));
    }
}

//********************************
//    Check Outs [ArrayList]
//********************************
// All stack/queues
class CheckOuts {
    //    Create checkouts and rng objects/arrays
    Random rng = new Random();
    ArrayList<CheckOut> checkOuts = new ArrayList<>();
    int numberCheckouts;

    //================
    //    Constructor
    //================
    CheckOuts() {
        numberCheckouts = 5;
        for (int i = 0; i < numberCheckouts; i++) {
            checkOuts.add(new CheckOut(rng.nextInt(1000)));
        }
    }

    //================
    //    Add Customer (to shortest line)
    //================
    void addCustomer () {
        CheckOut checkOut = this.findShortestCheckout();
        if (checkOut == null) {
            checkOuts.get(0).line.add(new Customer(rng.nextInt(1000)));
            return;
        }
        checkOut.line.add(new Customer(rng.nextInt(1000)));
    }

    //================
    //    Find and return shortest checkout
    //================
    CheckOut findShortestCheckout() {
        int shortestLine          = 2147483647;
        CheckOut checkOut = null;
// Search for shortest queue starting at highest int val
        for (CheckOut checkout: checkOuts) {
            if (shortestLine > checkout.line.size()) {
                shortestLine = checkout.line.size();
                checkOut = checkout;
            }
        }
//        System.out.println("checkout: " + checkOut);
        return checkOut;
    }


    //================
    //    Progress Time
    //================
//    Progresses the int clock by removing time from customer time
    void progressTime() {
        for (CheckOut checkout: checkOuts) {
            if (checkout.line.size() > 0) {
                checkout.line.get(0).time--;
            }
        }
    }

    //================
    //    Remove Customers
    //================
//    pop any customers that have a queue time of 0
    void removeCustomers () {
        for (CheckOut checkout: checkOuts) {
            if (checkout.line.size() > 0 && checkout.line.get(0).time <= 0) {
                checkout.line.remove(0);
            }
        }
    }

    //================
    //    Check if all checkouts empty
    //================
//    Checks if checkout queue is empty and returns boolean
    boolean bEmptyCheckouts () {
        for (CheckOut checkout: checkOuts) {
            if (checkout.line.size() > 0) {
                return false;
            }
        }
        return true;
    }

    //================
    //    To String override
    //================
//    Overrides existing tostring
    public String toString () {
        String sReturn = "";
        for (int i = 0; i < checkOuts.size(); i++) {
            sReturn += "Checkout: " + (i+1) + " has " + checkOuts.get(i).line.size() + " customers\n";
        }
        return sReturn;
    }

}
//********************************
//    Shoppers (Main)
//********************************
public class Shoppers {
    public static void main (String[] args) {
        CheckOuts checkOuts = new CheckOuts();
        Random rng          = new Random();
        String previousSout = "";

//        Variables for customer list and while loop customer iteration
        ArrayList<Integer> customers = new ArrayList<>();

//        Create and sort customer list
        int totalCustomers = 10;
        for (int i = 0; i  < totalCustomers; i++) customers.add( rng.nextInt(1500));
        Collections.sort(customers);


        int clock = 0;
        while (true) {
//            Determine if new customer at checkout and create
            if (customers.size() > 0) {
                while (customers.size() > 0 && customers.get(0) == clock) {
                    customers.remove(0);
                    checkOuts.addCustomer();
                }
            }


            checkOuts.removeCustomers();
            checkOuts.progressTime();
// Compares existing tostring and new tostring and if they are differnet print new tostring
            if (!previousSout.equals(checkOuts.toString())) {
                System.out.println("Clock: " + clock);
                if (customers.size() > 0) System.out.println("Customers remaining outside of Queue: " + customers);
                previousSout = checkOuts.toString();
                System.out.println(previousSout);
            }

//            error handling if timer gets to high
            clock++;
            if (clock >= 10000) {
                System.out.println("I am broken OR there are to many customers");
                break;
            }

//            Break while condition and increase clock
            if (customers.size() == 0 && checkOuts.findShortestCheckout() == null) break;
            if(checkOuts.bEmptyCheckouts()) break;
        }
    }
}