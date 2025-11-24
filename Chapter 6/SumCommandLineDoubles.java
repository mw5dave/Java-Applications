// Exercise616_SumCommandLineDoubles.java


public class SumCommandLineDoubles {
    public static void main(String[] args) {
        double sum = 0;
        for (String s : args) {
            try { sum += Double.parseDouble(s); }
            catch (NumberFormatException e) { System.err.println("Skipping: " + s); }
        }
        System.out.println("Sum = " + sum);
    }
}
