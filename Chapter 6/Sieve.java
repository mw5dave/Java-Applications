// Exercise627_Sieve.java


import java.util.Arrays;

public class Sieve {
    public static void main(String[] args) {
        boolean[] prime = new boolean[1000];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i * i < prime.length; i++) {
            if (prime[i]) {
                for (int j = i * i; j < prime.length; j += i) prime[j] = false;
            }
        }
        System.out.println("Primes between 2 and 999:");
        for (int i = 2; i < prime.length; i++) if (prime[i]) 
			System.out.print(i + " ");
        System.out.println();
    }
}
