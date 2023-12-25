/**
 * This class contain a "AddTwo" mission.
 * 
 * @author (Yitzhak baror)
 * @version (20.12.2023)
 */
public class AddTwo {
    // Trying to do this mission with puonction :)
    public static int calcSum(int a, int b) {
        int c = a+b;
        return c;
    }
    public static void main(String[] args) {
        // Declrate variables
        int a, b, c;
        // Getting values from the user
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        // Calculate the result
        c = calcSum(a, b);
        // Print result
        System.out.println(a + " + " + b + " = " + c);
    }
}