// Exercise617_DiceRolling.java


import java.util.Random;

public class DiceRolling {
    public static void main(String[] args) {
        final int ROLLS = 36_000_000;
        long[] tally = new long[13]; 
        Random rnd = new Random();
        for (int i = 0; i < ROLLS; i++) {
            int d1 = rnd.nextInt(6) + 1;
            int d2 = rnd.nextInt(6) + 1;
            tally[d1 + d2]++;
        }
        System.out.println("Sum\tCount");
        for (int s = 2; s <= 12; s++) System.out.printf("%2d\t%d%n", s, tally[s]);
    }
}
