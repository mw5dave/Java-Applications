// Exercise624_EightQueensHeuristic.java


import java.util.Arrays;

public class EightQueensHeuristic {
    static final int N = 8;
    public static void main(String[] args) {
        int[][] board = new int[N][N];
        boolean[] placed = new boolean[8];
        for (int q = 0; q < 8; q++) {
            int bestR=-1, bestC=-1, bestVal=Integer.MAX_VALUE;
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    if (board[r][c] != 0) continue;
                    int elim = eliminationValue(r,c,board);
                    if (elim < bestVal) { bestVal = elim; bestR=r; bestC=c; }
                }
            }
            if (bestR==-1) break;
            board[bestR][bestC] = q+1; // place queen
        }
        for (int r=0;r<N;r++){
            for (int c=0;c<N;c++) System.out.print((board[r][c]>0?"Q":"." ) + " ");
            System.out.println();
        }
    }

    static int eliminationValue(int r, int c, int[][] board) {
        boolean[][] mark = new boolean[N][N];
        for (int i=0;i<N;i++) mark[r][i] = mark[i][c] = true;
        for (int dr=-N; dr<=N; dr++) {
            int rr=r+dr, cc=c+dr;
            if (rr>=0 && rr<N && cc>=0 && cc<N) mark[rr][cc]=true;
            rr=r+dr; cc=c-dr;
            if (rr>=0 && rr<N && cc>=0 && cc<N) mark[rr][cc]=true;
        }
        int count=0;
        for (int i=0;i<N;i++) for (int j=0;j<N;j++) if (mark[i][j] && board[i][j]==0) count++;
        return count;
    }
}
