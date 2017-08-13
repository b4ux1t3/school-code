package week6.assignment1;

public abstract class InsuranceAgentApp {
    private String type;
    protected String name;
    protected float riskAmount;
    protected static float totalPremium;

    public InsuranceAgentApp(String type){

    }

    public InsuranceAgentApp(){

    }

    public abstract void setInsuredObjectName(String name);

    public abstract void setRiskAmount(float risk);

    public abstract void display();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static float getTotalPremium() {
        return totalPremium;
    }

    public float getRiskAmount() {
        return riskAmount;
    }
}
