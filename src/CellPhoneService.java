import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for their requirements
        System.out.println("Enter the maximum monthly amount you need for talking minutes:");
        int minutes = scanner.nextInt();

        System.out.println("Enter the maximum monthly amount you need for text messages:");
        int texts = scanner.nextInt();

        System.out.println("Enter the maximum monthly amount you need for gigabytes of data:");
        int data = scanner.nextInt();

        String planRecommendation = ""; // To store the recommended plan

        // Determine the best plan
        if (data > 0) {
            if (data <= 3) {
                planRecommendation = "Plan E at R150 per month.";
            } else {
                planRecommendation = "Plan F at R230 per month.";
            }
        } else if (minutes >= 500) {
            if (texts > 100) {
                planRecommendation = "Plan D at R115 per month.";
            } else {
                planRecommendation = "Plan C at R90 per month.";
            }
        } else if (minutes < 500) {
            if (texts == 0) {
                planRecommendation = "Plan A at R150 per month.";
            } else {
                planRecommendation = "Plan B at R210 per month.";
            }
        }

        // Output the recommendation
        System.out.println("We recommend: " + planRecommendation);

        // Close the scanner
        scanner.close();
    }
}
