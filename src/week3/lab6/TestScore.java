package week3.lab6;

/**
 * Created by Chris Pilcher on 7/5/2017.
 */

import java.util.Scanner;

public class TestScore {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        // Create the roster with 5 indexes
        double[] roster = new double[5];

        // Loop through teh roster and just try to put each new double from our scanner into their grade
        for (int i = 0; i < roster.length; i ++){
            try{
                roster[i] = getScore(console);
            } catch(ScoreException ex){
                // If the score is too high or low, we don't let it through.
                System.out.println(ex.getMessage());
                roster[i] = 0;
            }
        }

        for (int i = 0; i < roster.length; i++){
            System.out.printf("Student %d:\t%.2f\n", i, roster[i]);
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
}
