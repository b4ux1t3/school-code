package week1.lab2;

/**
 * Created by Chris Pilcher on 7/2/2017.
 */
// We're gonna need a scanner to get user input.
import java.util.Scanner;

public class UseCourse {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        // We want to simulate the user entering multiple courses, so this will be put in a while loop.
        // In order to save the garbage collector some work, we'll be declaring these variables outside
        // of the loop, so that we don't have to make the garbage collector collect the same thing over
        // and over again. If this were real, we'd probably pipe the output to a database to be stored.
        // In this case, we're just going to keep overwriting the courses.
        String dept;
        int courseID;
        int credits;

        CollegeCourse course;

        while(true){
            printf("Department:\t");
            dept = console.nextLine().toUpperCase();
            printf("Course ID:\t");
            courseID =console.nextInt();
            printf("Credits:\t");
            credits = console.nextInt();
            printf("\n");
            console.nextLine();

            switch (dept.toUpperCase()){
                case "BIO":
                case "CHM":
                case "CIS":
                case "PHY":
                    course = new LabCourse(dept, courseID, credits);
                    break;
                default:
                    course = new CollegeCourse(dept, courseID, credits);
            }

            course.display();
            printf("\n");

        }
    }

    // This is so that I don't have to keep typing System.out.printf.
    // Seriously, ugh.
    private static void printf(String input){
        System.out.printf(input);
    }
}
