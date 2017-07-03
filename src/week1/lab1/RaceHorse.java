package week1.lab1;

/**
 * Created by Chris Pilcher on 7/2/2017.
 */
public class RaceHorse extends Horse {
    // Most racehorses race only a dozen or so times in their lives.
    private byte races;

    public byte getRaces() {
        return races;
    }

    public void setRaces(byte races) {
        this.races = races;
    }
}
