// Calculates and prints the roots of the quadratic
// equation x^2 + bx + c = 0
public class Quad1 {
   // Computes the roots of the equation x^2 + bx + c = 0
   public static void main(String[] args) {
      // Gets and parses b and c from command-line
      double b = Double.parseDouble(args[0]);
      double c = Double.parseDouble(args[1]);

      // Calculates the roots
      double discriminant = b * b - 4.0 * c;
      double d = Math.sqrt(discriminant);
      double root1 = (-b + d) / 2.0;
      double root2 = (-b - d) / 2.0;

      // Prints the roots
      System.out.println(root1);
      System.out.println(root2);
    }
}
