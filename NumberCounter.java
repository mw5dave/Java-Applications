import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        int number;

        System.out.println("Enter numbers:");

        while (true) {
            number = input.nextInt();

            // Check for sentinel value
            if (number == -1) {
                break; 
            }

            // Classify the number
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        // Display the results
        System.out.println("\nResults:");
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeros: " + zeroCount);

        input.close();
    }
}
