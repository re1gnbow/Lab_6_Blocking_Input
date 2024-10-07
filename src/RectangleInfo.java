import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0, height = 0;
        boolean validInput;

        // Input for width
        do {
            validInput = true;
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
            } else {
                validInput = false;
                System.out.println("Invalid input. Please enter a valid number.");
                in.next();
            }
        } while (!validInput);

        // Input for height
        do {
            validInput = true;
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
            } else {
                validInput = false;
                System.out.println("Invalid input. Please enter a valid number.");
                in.next();
            }
        } while (!validInput);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
    }
}
