// Exercise621_KnightsTour.java


import java.util.Arrays;

public class KnightsTour {
    static final int SIZE = 8;
    static final int[] hor = {2,1,-1,-2,-2,-1,1,2};
    static final int[] ver = {-1,-2,-2,-1,1,2,2,1};

    public static void main(String[] args) {
        int fullTours = 0;
        for (int startRow = 0; startRow < SIZE; startRow++) {
            for (int startCol = 0; startCol < SIZE; startCol++) {
                int moves = tourFrom(startRow, startCol);
                if (moves == 64) fullTours++;
                System.out.printf("Start (%d,%d) -> moves: %d%n", startRow, startCol, moves);
            }
        }
        System.out.println("Full tours found: " + fullTours);
    }

    static int tourFrom(int sr, int sc) {
        int[][] board = new int[SIZE][SIZE];
        int move = 1;
        int r = sr, c = sc;
        board[r][c] = move++;
        int[][] access = initAccessibility();
        // reduce access for starting square
        reduceAccess(access, r, c);

        while (move <= 64) {
            int bestMove = -1;
            int bestAccess = Integer.MAX_VALUE;
            int bestR = -1, bestC = -1;
            for (int m = 0; m < 8; m++) {
                int nr = r + ver[m], nc = c + hor[m];
                if (isValid(nr, nc) && board[nr][nc] == 0) {
                    if (access[nr][nc] < bestAccess) {
                        bestAccess = access[nr][nc];
                        bestMove = m; bestR = nr; bestC = nc;
                    }
                }
            }
            if (bestMove == -1) 
				break;
			
            r = bestR; c = bestC;
            board[r][c] = move++;
            reduceAccess(access, r, c);
        }
        return move - 1;
    }

    static void reduceAccess(int[][] access, int r, int c) {
        // when a square is occupied, reduce accessibility of reachable squares by 1
        for (int m = 0; m < 8; m++) {
            int nr = r + ver[m], nc = c + hor[m];
            if (isValid(nr, nc) && access[nr][nc] > 0) access[nr][nc]--;
        }
        access[r][c] = 0;
    }

    static int[][] initAccessibility() {
        int[][] a = new int[SIZE][SIZE];
        int[][] base = {
            {2,3,4,4,4,4,3,2},
            {3,4,6,6,6,6,4,3},
            {4,6,8,8,8,8,6,4},
            {4,6,8,8,8,8,6,4},
            {4,6,8,8,8,8,6,4},
            {4,6,8,8,8,8,6,4},
            {3,4,6,6,6,6,4,3},
            {2,3,4,4,4,4,3,2}
        };
        for (int i = 0; i < SIZE; i++) for (int j = 0; j < SIZE; j++) a[i][j] = base[i][j];
        return a;
    }

    static boolean isValid(int r, int c) { return r >= 0 && r < SIZE && c >= 0 && c < SIZE; }
}
