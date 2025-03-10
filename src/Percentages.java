import java.util.Scanner;

public class Percentages {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        //promt user for first number
        System.out.println("Enter your first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        computePercentages(num1, num2);

        scanner.close();

        public static void computePercentages(double number1, double number2) {
            System.out.println("\nYou entered: " + number1 + " and " + number2);

            if (number2 != 0) {
                double percentage = (number1 / number2) * 100;
                System.out.printf("%f is %.2f%% of %f\n", number1, percentage, number2);
            } else {
                System.out.println("Cannot compute percentage; the second number is zero.");

    }

}