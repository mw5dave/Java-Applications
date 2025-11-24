// Exercise615_CommandLineArraySize.java


import java.util.Arrays;

public class CommandLineArraySize {
    public static void main(String[] args) {
        int size = 10;
        if (args.length > 0) {
            try { size = Integer.parseInt(args[0]); }
            catch (NumberFormatException e) { 
			System.out.println("Invalid arg; using default 10"); }
        }
        int[] arr = new int[size];
        Arrays.fill(arr, 0);
        System.out.println("Created array of size " + size);
    }
}
