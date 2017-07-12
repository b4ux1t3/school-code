package week2.lab3;

/**
 * Created by Chris Pilcher on 7/2/2017.
 */

import java.util.Scanner;

public class UseInsurance {
    public static void main(String[] args){
        // We need a scanner to read the input from the user.
        Scanner console = new Scanner(System.in);

        // We will store the response in a variable declared outside of teh loop, to avoid garbage collection pauses.
        int response;

        // This would normally be shipped off to a data store, but for now we'll just spit it back at the user.
        Insurance plan;

        while(true){
            System.out.println("What kind of insurance would you like to sign up for?\n1.\tLife Insurance\n2.\tHealth Insurance\n3.\tExit");
            response = console.nextInt();
            switch(response){
                case 1:
                    plan = new Life();
                    plan.display();
                    break;
                case 2:
                    plan = new Health();
                    plan.display();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Please enter a number listed in teh options above.");
            }
        }
    }
}
