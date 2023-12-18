/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
    public static void main(String[] args) {
        int a,b,c;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = a + b;
        System.out.println( a + " + " + b + " = " + c);
    }
}
