// Name:       Richard Eldridge
// Class:      CS 3305 W03
// Term:       Spring 2024
// Instructor: Carla McManus
// Assignment: 3 - Part 2 Capitals
// IDE:        IntelliJ IDEA Edu

//Declare Imports
import java.util.*;
//Main class
public class Capitals {
    public static void main(String[] args) {
//      Array of all {states, capitals} as 2 dim array
        String[][] capitals = {
            {"Alabama", "Montgomery"},
            {"Alaska", "Juneau"},
            {"Arizona", "Phoenix"},
            {"Arkansas", "Little Rock"},
            {"California", "Sacramento"},
            {"Colorado", "Denver"},
            {"Connecticut", "Hartford"},
            {"Delaware", "Dover"},
            {"Florida", "Tallahassee"},
            {"Georgia", "Atlanta"},
            {"Hawaii", "Honolulu"},
            {"Idaho", "Boise"},
            {"Illinois", "Springfield"},
            {"Maryland", "Annapolis"},
            {"Minnesota", "Saint Paul"},
            {"Iowa", "Des Moines"},
            {"Maine", "Augusta"},
            {"Kentucky", "Frankfort"},
            {"Indiana", "Indianapolis"},
            {"Kansas", "Topeka"},
            {"Louisiana", "Baton Rouge"},
            {"Oregon", "Salem"},
            {"Oklahoma", "Oklahoma City"},
            {"Ohio", "Columbus"},
            {"North Carolina", "Raleigh"},
            {"North Dakota", "Bismark"},
            {"New York", "Albany"},
            {"New Mexico", "Santa Fe"},
            {"New Jersey", "Trenton"},
            {"New Hampshire", "Concord"},
            {"Nevada", "Carson City"},
            {"Nebraska", "Lincoln"},
            {"Montana", "Helena"},
            {"Missouri", "Jefferson City"},
            {"Mississippi", "Jackson"},
            {"Massachusettes", "Boston"},
            {"Michigan", "Lansing"},
            {"Pennslyvania", "Harrisburg"},
            {"Rhode Island", "Providence"},
            {"South Carolina", "Columbia"},
            {"South Dakota", "Pierre"},
            {"Tennessee", "Nashville"},
            {"Texas", "Austin"},
            {"Utah", "Salt Lake City"},
            {"Vermont", "Montpelier"},
            {"Virginia", "Richmond"},
            {"Washington", "Olympia"},
            {"West Virginia", "Charleston"},
            {"Wisconsin", "Madison"},
            {"Wyoming", "Cheyenne"}
        };

//      Create objects and varialbes
        Random rng = new Random();
        Scanner sc = new Scanner(System.in);

        boolean bRun = true;
        int
            iIndex,
            iNumCorrect = 0,
            iRunTimes   = 0;

        String sInput;

//      Main while loop for program to run 5 times
        while (bRun && iRunTimes < 5) {
//          Determine the random index to be used in question
            iIndex = rng.nextInt(capitals.length);

//          Ask user What is the capital of... and capture response
            System.out.println("What is the capital of " + capitals[iIndex][0]);
            sInput = sc.nextLine();

//          Check answer and respond accordingly
            if (sInput.toLowerCase().trim().replaceAll("\n", "").equals(capitals[iIndex][1].toLowerCase())) {
                System.out.println("Correct");
                iNumCorrect++;
            } else {
                System.out.println(sInput + " was incorrect. The correct answer is: " + capitals[iIndex][1]);
            }
//          Keep track of times program has run
            iRunTimes++;
        }
//      Output the number of correct responses
        System.out.println("Total number of correct answers: " + iNumCorrect);
    }
}