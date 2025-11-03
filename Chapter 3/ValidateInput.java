import java.util.Scanner;

public class ValidateInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1 or 2: ");
        int value = input.nextInt();

        while (value != 1 && value != 2) {
            System.out.print("Invalid input. Enter 1 or 2: ");
            value = input.nextInt();
        }

        System.out.println("You entered: " + value);
    }
}
