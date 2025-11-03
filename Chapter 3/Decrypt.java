import java.util.Scanner;

public class Decrypt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter encrypted 4-digit number: ");
        int number = input.nextInt();

        int d1 = (number / 1000) % 10;
        int d2 = (number / 100) % 10;
        int d3 = (number / 10) % 10;
        int d4 = number % 10;

        int temp1 = d3, temp2 = d4;
        d3 = d1;
        d4 = d2;
        d1 = temp1;
        d2 = temp2;

        d1 = (d1 + 10 - 7) % 10;
        d2 = (d2 + 10 - 7) % 10;
        d3 = (d3 + 10 - 7) % 10;
        d4 = (d4 + 10 - 7) % 10;

        int decrypted = d1 * 1000 + d2 * 100 + d3 * 10 + d4;
        System.out.printf("Decrypted number: %04d%n", decrypted);
    }
}
