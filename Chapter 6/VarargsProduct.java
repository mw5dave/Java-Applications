// Exercise614_VarargsProduct.java


public class VarargsProduct {
    public static long product(int... nums) {
        long p = 1;
        for (int n : nums) p *= n;
        return p;
    }
    public static void main(String[] args) {
        System.out.println(product(2,3)); // 6
        System.out.println(product(5,4,3)); // 60
        System.out.println(product(7)); // 7
        System.out.println(product()); // 1 (empty product)
    }
}
