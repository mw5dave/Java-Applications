// Exercise622_KnightsTourBruteForce.java


import java.util.Random;
import java.util.Arrays;

public class KnightsTourBruteForce {
    static final int SIZE = 8;
    static final int[] hor = {2,1,-1,-2,-2,-1,1,2};
    static final int[] ver = {-1,-2,-2,-1,1,2,2,1};

    public static void main(String[] args) {
        Random rnd = new Random();
        int[] histogram = new int[65]; // index = tour length (1..64)
        int trials = 1000;
        for (int t = 0; t < trials; t++) {
            int len = randomTourLength(rnd);
            histogram[len]++;
        }
        System.out.println("Length\tCount");
        for (int i = 1; i <= 64; i++) if (histogram[i] > 0) System.out.printf("%d\t%d%n", i, histogram[i]);
    }

    static int randomTourLength(Random rnd) {
        int[][] board = new int[SIZE][SIZE];
        int moves = 1;
        int r = rnd.nextInt(SIZE), c = rnd.nextInt(SIZE);
        board[r][c] = moves++;
        while (true) {
            int[] possible = new int[8];
            int pc = 0;
            for (int m = 0; m < 8; m++) {
                int nr = r + ver[m], nc = c + hor[m];
                if (nr >= 0 && nr < SIZE && nc >= 0 && nc < SIZE && board[nr][nc] == 0) {
                    possible[pc++] = m;
                }
            }
            if (pc == 0) break;
            int choice = possible[rnd.nextInt(pc)];
            r += ver[choice]; c += hor[choice];
            board[r][c] = moves++;
            if (moves > 64) break;
        }
        return moves - 1;
    }
}
