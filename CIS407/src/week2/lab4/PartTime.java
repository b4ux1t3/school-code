package week2.lab4;

/**
 * Created by Chris Pilcher on 7/3/2017.
 */
public class PartTime extends Student{

    public PartTime(int credits){
        super(credits);
    }
    @Override
    public double calcTuition() {
        return this.getCredits() * 200.00;
    }
}
