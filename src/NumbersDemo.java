import java.util.Scanner;

public class NumbersDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter values for two integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Call the methods for each integer
        System.out.println("\nResults for the first integer (" + num1 + "):");
        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);

        System.out.println("\nResults for the second integer (" + num2 + "):");
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);

        // Close the scanner
        scanner.close();
    }

    // Method to display twice the number
    public static void displayTwiceTheNumber(int number) {
        System.out.println("Twice the number: " + (number * 2));
    }

    // Method to display the number plus five
    public static void displayNumberPlusFive(int number) {
        System.out.println("Number plus five: " + (number + 5));
    }

    // Method to display the square of the number
    public static void displayNumberSquared(int number) {
        System.out.println("Number squared: " + (number * number));
    }
}
