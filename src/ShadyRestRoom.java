import java.util.Scanner;

public class ShadyRestRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price = 0;

        // Prompt user for bed selection
        System.out.println("Choose a bed type:");
        System.out.println("1 - Queen bed (R500)");
        System.out.println("2 - King bed (R700)");
        System.out.println("3 - King bed with pullout couch (R900)");
        System.out.print("Enter your choice: ");
        int bedChoice = scanner.nextInt();

        // Determine price based on bed choice
        switch (bedChoice) {
            case 1:
                price = 500;
                System.out.println("You selected a Queen bed.");
                break;
            case 2:
                price = 700;
                System.out.println("You selected a King bed.");
                break;
            case 3:
                price = 900;
                System.out.println("You selected a King bed with a pullout couch.");
                break;
            default:
                System.out.println("Invalid bed choice.");
                price = 0;
                break;
        }

        // If bed choice is valid, ask for view preference
        if (price != 0) {
            System.out.println("Choose a room view:");
            System.out.println("1 - Lake view (add R100)");
            System.out.println("2 - Park view (no extra charge)");
            System.out.print("Enter your choice: ");
            int viewChoice = scanner.nextInt();

            // Adjust price based on view choice
            if (viewChoice == 1) {
                price += 100;
                System.out.println("You selected a Lake view.");
            } else if (viewChoice == 2) {
                System.out.println("You selected a Park view.");
            } else {
                System.out.println("Invalid view choice. Defaulting to Lake view.");
                price += 100;
            }
        }

        // Display the final price
        System.out.println("The total price for your room is: R" + price);

        // Close the scanner
        scanner.close();
    }
}
