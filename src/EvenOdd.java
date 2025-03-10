import java.util.Scanner; // Import Scanner to read user input

public class EvenOdd{
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read user input

        // Check if the number is even or odd using modulus operator
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        // Close the Scanner
        scanner.close();
    }
}
