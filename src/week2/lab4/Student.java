package week2.lab4;

/**
 * Created by Chris Pilcher on 7/3/2017.
 */
abstract class Student {

    private int credits;
    private boolean fullTime;

    public Student(int credits){

        this.credits = credits;

        // This will set the fullTime status to the result of whether or not there are greater than
        // or equal to 18 credits. Who needs if statements?
        this.fullTime = credits >= 18;
    }

    public abstract double calcTuition();

    public int getCredits() {
        return credits;
    }

    public void display(){

        System.out.printf("Fulltime?\t%b\nCredits:\t%d\nTuition:\t%.2f\n\n", this.fullTime, this.credits, this.calcTuition());
    }
}
