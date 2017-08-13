package week6.assignment1;

import java.util.LinkedList;

// I'm just going to use this as a place to store insurances, rather than have them floating around.
class Customer {
    LinkedList<TravelInsurance> travel;
    LinkedList<AutomobileInsurance> autos;
    LinkedList<PropertyInsurance> properties;

    public Customer(){
        this.travel = new LinkedList<TravelInsurance>();
        this.autos = new LinkedList<AutomobileInsurance>();
        this.properties = new LinkedList<PropertyInsurance>();
    }

    public void showInsurance(){
        // This is a simple switch to see if we've actually displayed anything.
        // If we haven't we'll display a message ot the user saying they haven't
        // signed up for anything yet.
        boolean showed = false;

        // If we have any AutomobileInsurance objects. . .
        if (!autos.isEmpty()){
            // Display each of them.
            for (AutomobileInsurance insurance : autos){
                insurance.display();
            }
            showed = true;
        }

        // If we have any PropertyInsurance objects. . .
        if (!properties.isEmpty()){
            // Display each of them
            for (PropertyInsurance insurance : properties){
                insurance.display();
            }
            showed = true;
        }

        // You get the idea
        if (!travel.isEmpty()){

            for (TravelInsurance insurance : travel){
                insurance.display();
            }
            showed = true;
        }

        // Show the user that they are not enrolled in. . .well, jesus, look at the print argument!
        if (!showed){
            BuyInsurance.print("You haven't enrolled in any insurance yet!");
        } else {
            BuyInsurance.print(String.format("Total Premium:\t$%.2f", InsuranceAgentApp.getTotalPremium()));
        }
    }
}
