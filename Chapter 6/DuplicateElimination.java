// Exercise612_DuplicateElimination.java


import java.util.Scanner;
import java.util.Arrays;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] uniques = new int[5];
        int uniqueCount = 0;
        System.out.println("Enter five numbers between 10 and 100:");
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            if (num < 10 || num > 100) {
                System.out.println("Out of range; try again.");
                i--; continue;
            }
            boolean dup = false;
            for (int j = 0; j < uniqueCount; j++) if (uniques[j] == num) { dup = true; break; }
            if (!dup) {
                uniques[uniqueCount++] = num;
                System.out.print("Unique so far: ");
                for (int k = 0; k < uniqueCount; k++) System.out.print(uniques[k] + " ");
                System.out.println();
            } else {
                System.out.println(num + " is a duplicate; not added.");
            }
        }
        sc.close();
        System.out.println("Final unique set: " + Arrays.toString(Arrays.copyOf(uniques, uniqueCount)));
    }
}
