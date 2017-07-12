package week3.lab6;

/**
 * Created by Chris Pilcher on 7/5/2017.
 */

import java.util.Scanner;
import java.util.LinkedList;
import java.util.HashMap;

// Honestly, this assignment was a bit simple, so I put my own spin on it. It uses HashMaps, LinkedLists,
// and the prescribed exceptions to implement a pretty decent little grade tracker. All it's missing is a
// way to export the data.

public class TestScoreAdvanced {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        // Preventing garbage collection one lab at a time
        double score;
        Integer studentID;

        // We're going to store the students in a HashMap that ties their student ID, the key,
        // to a LinkedList of scores.
        HashMap<Integer, LinkedList<Double>> roster = new HashMap<>();

        while(true){
            // Get the student for which we want to add a grade.
            System.out.println("Which student do you want to add a grade for?");
            studentID = console.nextInt();

            // First we'll try to get a score from the console.
            try{
                score = getScore(console);
            } catch (ScoreException ex){
                // If the score is too high or low, we don't let it through.
                System.out.println(ex.getMessage());
                continue;
            }

            // Update the scores for the student.
            updateStudent(studentID, roster, score);

            // Here we're just iterating through the students and printing out their scores.
            for(Integer key : roster.keySet()){
                System.out.printf("Student:\t%d\n", key);
                for (Double value : roster.get(key)){
                    System.out.println(value);
                }
            }
        }
    }
    // Our getScore method will attempt to get a double from the user, and throw a ScoreException if that double is
    // not within the predetermined range.
    private static double getScore(Scanner input) throws ScoreException{
        System.out.println("What score did the student get?");
        double score = input.nextDouble();

        if (score > 100 || score < 0){
            throw new ScoreException();
        }

        return score;
    }

    private static void updateStudent(int studentID, HashMap<Integer, LinkedList<Double>> roster, double newGrade){
        // We will try to look up the studentID in the roster.
        LinkedList<Double> grades = roster.get(studentID);

        // If we get null back, we know tht that student has never been entered into the gradebook, so we instantiate
        // a list there to store their grades
        if (grades == null){
            roster.put(studentID, new LinkedList<>());

            // Now we recursively pass the student and the roster to updateStudent. That student will now
            // have a list instantiated there, so we won't hit this block again.
            updateStudent(studentID, roster, newGrade);
        } else {
            // Since we know that there is actually a LinkedList here, we can just add the grade to the student's grades
            grades.add(newGrade);
        }
    }
}
