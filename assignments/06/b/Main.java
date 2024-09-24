// Name:       Richard Eldridge
// Class:      CS 3305 W03
// Term:       Spring 2024
// Instructor: Carla McManus
// Assignment: 06-Part-2.1-Miles
// IDE:        IntelliJ IDEA Edu

public class Main {
    static void findBigO (long number) {
        long timeStart = System.currentTimeMillis();

        for (int i = 0; i < number; i++) {
            String rString = "";
            for (int j = 0; j <= 90; j += 10) {
                rString += j + " Miles converts into: " + convertKM(j) + " Kilometers\n";
            }
            System.out.println(rString);
        }
        System.out.println("Process took " + (System.currentTimeMillis() - timeStart) + " Milliseconds");
        System.out.println("T(n) = c * n + 10");
        System.out.println("cn+10");
        System.out.println("This represents a BigO moment of O(n)");
    }

    static double convertKM(int miles) {
        return miles / 1.6;
    }

    public static void main(String[] args) {
        findBigO(1);
//        findBigO(10);
//        findBigO(100);
//        findBigO(1000);
//        findBigO(10000);
//        findBigO(100000);
//        findBigO(1000000);
//        findBigO(10000000);
    }
}