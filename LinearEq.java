/**
 * This class contain a "Triangle" mission.
 * 
 * @author (Yitzhak baror)
 * @version (20.12.2023)
 */
public class LinearEq {
    public static void main(String[] args) {
        // Declrate variables
        double a, b, c, x;
        // Getting value's from the user
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        c = Double.parseDouble(args[2]);
        x = (c - b) / a;
        // Print
        System.out.println(a + " * x + " + b + " = " + c);
        System.out.println("x = " + x);
    }
}