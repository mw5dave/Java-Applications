// Exercise610_SalesCommissions.java

import java.util.Scanner;

public class SalesCommissions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ranges = new int[9]; // 0->200-299 ... 8->1000+
        System.out.println("Enter gross sales for each salesperson (negative to finish):");
        while (true) {
            System.out.print("Gross sales: ");
            if (!sc.hasNextDouble()) break;
            double sales = sc.nextDouble();
            if (sales < 0) break;
            int salary = (int)(200 + 0.09 * sales); // truncated to int
            int index;
            if (salary >= 1000) index = 8;
            else index = Math.max(0, (salary - 200) / 100);
            if (index >= 0 && index < ranges.length) ranges[index]++; 
        }
        sc.close();

        String[] labels = {
            "$200-299", "$300-399", "$400-499", "$500-599", "$600-699",
            "$700-799", "$800-899", "$900-999", "$1000 and over"
        };
        System.out.println("\nSalary range summary:");
        for (int i = 0; i < ranges.length; i++) {
            System.out.printf("%-15s : %d%n", labels[i], ranges[i]);
        }
    }
}
