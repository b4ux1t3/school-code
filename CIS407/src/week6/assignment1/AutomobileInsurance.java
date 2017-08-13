package week6.assignment1;

public class AutomobileInsurance extends InsuranceAgentApp {

    private static final float RATE = 0.0075f;

    @Override
    public void setInsuredObjectName(String name) {
        this.name = name;
    }

    @Override
    public void setRiskAmount(float risk) {
        this.riskAmount = risk;
        totalPremium += risk * RATE;
    }

    @Override
    public void display() {
        BuyInsurance.print("Automobile");
        BuyInsurance.print("Car:\t\t\t" + this.name);
        BuyInsurance.print(String.format("Value:\t\t\t$%.2f", getRiskAmount()));
    }

    // I don't understand why we'd have to take a string to denote the type here.
    // We know that the type is "Automobile", so why can't we just pass "Automobile"
    // to the super() constructor? We shouldn't pass the buck to the implementer
    // here, that's just opening up the chance of a bug.
    public AutomobileInsurance(String name){
        super("Automobile");

        // I'm going to go ahead and set name here, in the constructor.
        this.setInsuredObjectName(name);
    }
}
