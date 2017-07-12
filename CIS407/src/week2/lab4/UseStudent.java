package week2.lab4;

/**
 * Created by Chris Pilcher on 7/3/2017.
 */

import java.util.Scanner;
public class UseStudent {
    public static void main(String[]args){
        // Need a scanner
        Scanner console = new Scanner(System.in);
        // As before, we're going to avoid garbage collection with each loop by declaring these variables outside it.
        Student student;
        int credits;

        while(true){
            System.out.println("How many credits are you taking?");
            credits = console.nextInt();

            student = credits >= 18 ? new FullTime(credits) : new PartTime(credits);

            student.display();
        }
    }
}
