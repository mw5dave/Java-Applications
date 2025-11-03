import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int account = input.nextInt();

        while (account != -5) {
            System.out.print("Enter beginning balance: ");
            int balance = input.nextInt();

            System.out.print("Enter total charges: ");
            int charges = input.nextInt();

            System.out.print("Enter total credits: ");
            int credits = input.nextInt();

            System.out.print("Enter credit limit: ");
            int limit = input.nextInt();

            int newBalance = balance + charges - credits;
            System.out.printf("New balance is %d%n", newBalance);

            if (newBalance > limit)
                System.out.println("Credit limit exceeded!");

            System.out.print("\nEnter account number: ");
            account = input.nextInt();
        }
    }
}
