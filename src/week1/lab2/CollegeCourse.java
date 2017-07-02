package week1.lab2;

/**
 * Created by Chris Pilcher on 7/2/2017.
 */
public class CollegeCourse {
    private String department;
    private int courseID;
    private int credits;
    private double fee;

    public CollegeCourse(String department, int courseID, int credits){
        this.department = department;
        this.courseID = courseID;
        this.credits = credits;
        this.fee = 120.00 * credits;

    }
    // This overloaded method is just in case I need to debug something.
    public CollegeCourse(String department, int courseID, int credits, double fee){
        this.department = department;
        this.courseID = courseID;
        this.credits = credits;
        this.fee = fee * credits;

    }

    public void display(){
        System.out.printf("Course:\t%s%d\nCredits:\t%d\nFee:\t$%.2f\n",
                this.department,
                this.courseID,
                this.credits,
                this.fee);
    }

    // Getters and setters
    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
