// Generates and prints a random integer in the ranhe [0,N).
public class RandomInt {
   // Generates a random integer from 0,...,N-1
   public static void main(String[] args) {
      // Gets N from the user
      int N = Integer.parseInt(args[0]); 
      double r = Math.random();
      int n = (int) (r * N);
      System.out.println("random integer is " + n);
   }
} 