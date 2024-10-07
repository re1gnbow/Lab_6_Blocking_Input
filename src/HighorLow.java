import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        int guess = 0;
        boolean validInput;

        do {
            validInput = true;
            System.out.print("Guess the number (1 to 10): ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                if (guess < 1 || guess > 10) {
                    validInput = false;
                    System.out.println("Invalid input. Please enter a number between 1 and 10.");
                }
            } else {
                validInput = false;
                System.out.println("Invalid input. Please enter a number between 1 and 10.");
                in.next();
            }
        } while (!validInput);

        System.out.println("The random number was: " + randomNumber);
        if (guess < randomNumber) {
            System.out.println("Your guess was too low.");
        } else if (guess > randomNumber) {
            System.out.println("Your guess was too high.");
        } else {
            System.out.println("Your guess was correct!");
        }
    }
}
