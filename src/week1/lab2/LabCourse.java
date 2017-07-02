package week1.lab2;

/**
 * Created by Chris Pilcher on 7/2/2017.
 */
public class LabCourse extends CollegeCourse{
    public LabCourse(String department, int courseID, int credits){
        // Calls the CollegeCourse constructor first.
        super(department, courseID, credits);
        // Adds $50 to the fee.
        this.setFee(this.getFee() + 50);
    }

    // This overloaded method is just in case I need to debug something.
    public LabCourse(String department, int courseID, int credits, double fee){
        super(department, courseID, credits, fee);

        this.setFee(this.getFee() + 50);
    }

    public void display(){
        super.display();
        System.out.println("This is a lab course. An additional $50 charge has been applied for lab equipment.");
    }
}
