// Exercise625_EightQueensBruteForce.java


import java.util.Random;
import java.util.Arrays;

public class EightQueensBruteForce {
    static final int N=8;
    public static void main(String[] args) {
        // (a) Random brute-force
        Random rnd = new Random();
        while (true) {
            int[] cols = new int[N];
            for (int i=0;i<N;i++) cols[i] = rnd.nextInt(N); // row i -> column cols[i]
            if (valid(cols)) { print(cols);
			break;
			}
        }

        // (b) Exhaustive via backtracking
        int[] cols = new int[N];
        if (solve(0, cols)) 
		{ System.out.println("Backtracking solution:"); print(cols); }
    }

    static boolean valid(int[] cols) {
        for (int i=0;i<N;i++) for (int j=i+1;j<N;j++) {
            if (cols[i]==cols[j]) return false;
            if (Math.abs(cols[i]-cols[j]) == Math.abs(i-j)) return false;
        }
        return true;
    }

    static boolean solve(int row, int[] cols) {
        if (row==N) return true;
        for (int c=0;c<N;c++) {
            cols[row]=c;
            boolean ok = true;
            for (int r=0;r<row;r++) if (cols[r]==c || Math.abs(cols[r]-c)==Math.abs(r-row)) { ok=false; 
			break; 
			}
			
            if (ok && solve(row+1, cols)) return true;
        }
        return false;
    }

    static void print(int[] cols){
        for(int r=0;r<N;r++){
            for(int c=0;c<N;c++) System.out.print(cols[r]==c ? "Q " : ". ");
            System.out.println();
        }
    }
}
