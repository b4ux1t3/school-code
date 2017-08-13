package week6.assignment1;

import java.util.LinkedList;
import java.util.Scanner;

public class BuyInsurance {
    private static enum choices {
        auto,
        property,
        travel,
        show,
        exit
    }
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args){
        Customer newCustomer = new Customer();
        int choice = 0;
        while (choice != choices.exit.ordinal() + 1){
            prompt();
            choice = nextInt();

            if (choice < choices.auto.ordinal() + 1 || choice > choices.exit.ordinal() + 1){
                continue;
            }

            enroll(choice, newCustomer);
        }
    }

    public static void print(String printme){
        System.out.printf(printme + "\n");
    }

    private static int nextInt(){
        int output = console.nextInt();

        // This flushes the line. The reason?
        // https://stackoverflow.com/a/16040699
        console.nextLine();

        return output;
    }

    private static float nextFloat(){
        float output = console.nextFloat();

        // This flushes the line. The reason?
        // https://stackoverflow.com/a/16040699
        console.nextLine();

        return output;
    }

    private static String getInput(){
        String response = console.nextLine();
        return response;
    }

    private static void prompt(){
        print("Which would you like to enroll in?\n1. Automobile\n2. Property\n3. Travel\n4. Show Insurance\n5. Exit");
    }

    // This will enroll a customer into an insurance policy and add it to their portfolio
    private static void enroll(int choice, Customer customer){
        switch (choice){
            case 1: // Automobile insurance
                print("What is the name of your car?");
                AutomobileInsurance newCar = new AutomobileInsurance(getInput());
                print("How much is that car worth?");
                newCar.setRiskAmount(nextFloat());
                customer.autos.add(newCar);
                break;
            case 2: // Property insurance
                print("What is the name of your property?");
                PropertyInsurance newProperty = new PropertyInsurance(getInput());
                print("How much is your property worth?");
                newProperty.setRiskAmount(nextFloat());
                customer.properties.add(newProperty);
                break;
            case 3: // Travel insurance
                print("What is the flight number?");
                TravelInsurance newTravel = new TravelInsurance(getInput());
                print("What is the price of the ticket?");
                newTravel.setRiskAmount(nextFloat());
                customer.travel.add(newTravel);
                break;
            case 4: // display enrolled insurances
                customer.showInsurance();
                break;
            default:
                break;
        }
    }
}

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
