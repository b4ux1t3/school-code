package week3.lab6;

/**
 * Created by Chris Pilcher on 7/5/2017.
 */
public class ScoreException extends Exception {
    public ScoreException(){
        super("Grade must be greater than 0 and less than or equal to 100.");
    }
}
