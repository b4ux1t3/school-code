package week3.lab5;

/**
 * Created by Chris Pilcher on 7/5/2017.
 */

import java.util.Random;
import java.util.Scanner;

public class NegativeArray {
    public static void main(String[] args){
        // As per usual, we need to get input from the user.
        Scanner console = new Scanner(System.in);

        // This is just so that we can put some random data in our array,
        // to verify that it is working.
        Random rand = new Random();

        // As per usual, we prevent garbage collection pauses by declaring our
        // input variable outside of the loop
        int response;
        int[] ourArray;

        while(true){
            System.out.println("What size would you like your array to be?");
            // Fortunately, we can limit the input that the user gives us to only integers.
            response = console.nextInt();
            try{
                ourArray = new int[response];
                // Filling our array with random integers.
                for (int i = 0; i < ourArray.length; i++){
                    ourArray[i] = rand.nextInt();
                }
            } catch(NegativeArraySizeException ex) {// Catching the negative array size
                System.out.println("Sorry, I can't make an array with a negative length!\n");
                // Skip back to the top of the loop and try again.
                continue;
            } catch(NumberFormatException ex){// Catching a non-numeric input. This shouldn't be able to happen.
                System.out.println("Sorry, I can't make an array with a non-integer length! How did you even get here?\n");
                // Skip back to the top of the loop and try again.
                continue;
            }
            // Just to make sure we created and filled the array, print out the whole array.
            for (int i = 0; i < ourArray.length; i++){
                System.out.println(ourArray[i]);
            }
        }
    }
}
