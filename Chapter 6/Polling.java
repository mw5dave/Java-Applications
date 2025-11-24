// Exercise633_Polling.java


import java.util.Scanner;
import java.util.Locale;

public class Polling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String[] topics = {
            "Climate Change",
            "Education",
            "Healthcare",
            "Poverty",
            "Clean Water"
        };
        int[][] responses = new int[5][10]; // rows topics, cols ratings 1..10
        System.out.println("Enter ratings for each topic (1-10). Type -1 to stop.");

        while (true) {
            System.out.println("New respondent? Type y/n:");
            if (!sc.next().equalsIgnoreCase("y")) break;
            for (int t = 0; t < topics.length; t++) {
                int rating;
                do {
                    System.out.printf("Rate '%s' (1-10): ", topics[t]);
                    rating = sc.nextInt();
                    if (rating == -1) break;
                } while (rating < 1 || rating > 10);
                if (rating == -1) { t = topics.length; break; }
                responses[t][rating-1]++;
            }
        }
        sc.close();

        System.out.printf("%-20s", "Topic");
        for (int r = 1; r <= 10; r++) System.out.printf("%4d", r);
        System.out.printf("%10s%n", "Average");
        double highestPoints = Double.MIN_VALUE; int highestIdx = -1;
        double lowestPoints = Double.MAX_VALUE; int lowestIdx = -1;
        for (int t = 0; t < topics.length; t++) {
            System.out.printf("%-20s", topics[t]);
            int totalCount = 0; int totalPoints = 0;
            for (int r = 0; r < 10; r++) {
                System.out.printf("%4d", responses[t][r]);
                totalCount += responses[t][r];
                totalPoints += (r+1) * responses[t][r];
            }
            double avg = totalCount == 0 ? 0.0 : (double) totalPoints / totalCount;
            System.out.printf("%10.2f%n", avg);
            if (totalPoints > highestPoints) { highestPoints = totalPoints; highestIdx = t; }
            if (totalPoints < lowestPoints) { lowestPoints = totalPoints; lowestIdx = t; }
        }
        System.out.printf("Highest point total: %s -> %.0f%n", topics[highestIdx], highestPoints);
        System.out.printf("Lowest point total: %s -> %.0f%n", topics[lowestIdx], lowestPoints);
    }
}
