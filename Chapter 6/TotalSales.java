// Exercise619_TotalSales.java


import java.util.Scanner;
import java.util.Locale;

public class TotalSales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double[][] sales = new double[5][4]; // products x salespeople
        System.out.println("Enter slips: salesperson(1-4) product(1-5) amount (negative salesperson to end)");
        while (true) {
            int sp = sc.nextInt();
            if (sp < 1 || sp > 4) break;
            int pr = sc.nextInt();
            double amt = sc.nextDouble();
            if (pr < 1 || pr > 5) continue;
            sales[pr-1][sp-1] += amt;
        }
        sc.close();

        System.out.printf("%10s", "Product\\SP");
        for (int sp = 1; sp <= 4; sp++) System.out.printf("%10s", "SP" + sp);
        System.out.printf("%12s%n", "ProductTotal");
        double grandTotal = 0;
        for (int p = 0; p < 5; p++) {
            double rowTotal = 0;
            System.out.printf("%10s", "Prod " + (p+1));
            for (int s = 0; s < 4; s++) { System.out.printf("%10.2f", sales[p][s]); rowTotal += sales[p][s]; }
            System.out.printf("%12.2f%n", rowTotal);
            grandTotal += rowTotal;
        }
        // Column totals
        System.out.printf("%10s", "Totals");
        for (int s = 0; s < 4; s++) {
            double colTotal = 0;
            for (int p = 0; p < 5; p++) colTotal += sales[p][s];
            System.out.printf("%10.2f", colTotal);
        }
        System.out.printf("%12.2f%n", grandTotal);
    }
}
