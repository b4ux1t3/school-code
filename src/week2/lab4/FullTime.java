package week2.lab4;

/**
 * Created by Chris Pilcher on 7/3/2017.
 */
public class FullTime extends Student {

    public FullTime(int credits){
        super(credits);
    }

    @Override
    public double calcTuition() {
        return 2000.0;
    }
}
