import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0, mpg = 0, pricePerGallon = 0;
        boolean validInput;

        // Input for gallons
        do {
            validInput = true;
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
            } else {
                validInput = false;
                System.out.println("Invalid input. Please enter a valid number.");
                in.next();
            }
        } while (!validInput);

        // Input for mpg
        do {
            validInput = true;
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
            } else {
                validInput = false;
                System.out.println("Invalid input. Please enter a valid number.");
                in.next();
            }
        } while (!validInput);

        // Input for price per gallon
        do {
            validInput = true;
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
            } else {
                validInput = false;
                System.out.println("Invalid input. Please enter a valid number.");
                in.next();
            }
        } while (!validInput);

        double costPer100Miles = (100 / mpg) * pricePerGallon;
        double maxDistance = gallons * mpg;

        System.out.println("Cost to drive 100 miles: $" + costPer100Miles);
        System.out.println("Maximum distance with a full tank: " + maxDistance + " miles");
    }
}
