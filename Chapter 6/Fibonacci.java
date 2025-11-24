// Exercise629_Fibonacci.java


import java.math.BigInteger;

public class Fibonacci {
    public static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long c = a + b;
            a = b; b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        // a) example
        System.out.println("F(10) = " + fibonacci(10));

        // b) largest Fibonacci as long
        int n = 0;
        long prev = 0, curr = 1;
        while (true) {
            long next = prev + curr;
            if (next < curr) break; // overflow
            prev = curr; curr = next; n++;
        }
        System.out.println("Largest Fibonacci index fitting in long (approx): " + n);

        // c) using double
        double da = 0, db = 1;
        int idx = 1;
        while (!Double.isInfinite(db)) {
            double dc = da + db;
            da = db; db = dc; idx++;
            if (Double.isInfinite(db)) break;
        }
        System.out.println("Largest Fibonacci index fitting in double (approx): " + idx);
    }
}
