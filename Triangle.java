/**
 * This class contain a "Triangle" mission.
 * @author (Yitzhak baror)
 * @version (20.12.2023)
 */
public class Triangle {
    public static void main(String[] args) {
        // Declrate variables
        int x, y, z;
        // getting length of the triangle (if it's triangle)
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        z = Integer.parseInt(args[2]);
        // check the "Triangle Inequality Theorem".
        boolean isTriangle = ((x + y > z) && (x + z > y) && (y + z > x));
        // print 
        System.out.println(x + ", " + y + ", " + z + ": " + isTriangle);
    }
}