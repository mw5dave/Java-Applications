import java.util.Scanner;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter current world population: ");
        double population = input.nextDouble();

        System.out.print("Enter annual growth rate (%): ");
        double rate = input.nextDouble() / 100;

        double doublePop = population * 2;
        int doubleYear = -1;

        System.out.println("\nYear\tPopulation\tIncrease");
        for (int year = 1; year <= 75; year++) {
            double increase = population * rate;
            population += increase;
            System.out.printf("%d\t%.0f\t%.0f%n", year, population, increase);

            if (doubleYear == -1 && population >= doublePop)
                doubleYear = year;
        }

        if (doubleYear != -1)
            System.out.printf("%nPopulation will double in %d years.%n", doubleYear);
        else
            System.out.println("\nPopulation will not double within 75 years.");
    }
}
