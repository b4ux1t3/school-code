package week2.lab3;

/**
 * Created by Chris Pilcher on 7/3/2017.
 */
abstract class Insurance {
    private String type;
    private double premium;

    public Insurance(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    public abstract void setCost();

    public abstract void display();
}
