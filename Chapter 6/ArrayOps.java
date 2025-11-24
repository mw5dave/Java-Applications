// Exercise611_ArrayOps.java


public class ArrayOps {
    public static void main(String[] args) {
        // a) Set the 10 elements of integer array counts to zero.
        int[] counts = new int[10];
        // already zero-initialized; or explicitly:
        for (int i = 0; i < counts.length; i++) counts[i] = 0;

        // b) Add one to each of the 15 elements of integer array bonus.
        int[] bonus = new int[15];
        for (int i = 0; i < bonus.length; i++) bonus[i]++;

        // c) Display the five values of integer array bestScores in column format.
        int[] bestScores = {95, 87, 100, 78, 88};
        for (int v : bestScores) System.out.println(v);
    }
}
