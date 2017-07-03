package week1.lab1;

/**
 * Created by Chris Pilcher on 7/2/2017.
 */
public class Horse {

    // The horse's name should be a string
    private String name;

    // Usually I would go with a enum, but there are far too many colors
    // to make that feasible.
    private String color;

    // The birth year will be represented as an integer. I would use a date,
    // but there would be a lot of overhead for something so simple.
    private int birthYear;

    // The getters and setters are final, as they do not need to be altered by subclasses.
    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final String getColor() {
        return color;
    }

    public final void setColor(String color) {
        this.color = color;
    }

    public final int getBirthYear() {
        return birthYear;
    }

    public final void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
