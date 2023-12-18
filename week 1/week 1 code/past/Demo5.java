public class Demo5 {
   public static void main(String[] args) {
      // Performs simple arithmetic operations on two commnand-line arguments
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      System.out.println(a + " + " + b + " = " + (a + b));
      System.out.println(a + " * " + b + " = " + (a * b));
      System.out.println(a + " / " + b + " = " + (a / b));
      System.out.println(a + " % " + b + " = " + (a % b));
   }
}