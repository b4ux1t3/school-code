package week2.lab3;

/**
 * Created by Chris Pilcher on 7/3/2017.
 */
public class Health extends Insurance{
    public Health(){
        super("Health");
        this.setCost();
    }

    @Override
    public void setCost() {
        this.setPremium((double) 196);
    }

    @Override
    public void display() {
        System.out.printf("You have been registered for %s insurance by Big Health Co.\nYour premium will be $%.2f a month.\n",
                this.getType(),
                this.getPremium());
    }
}
