// Illustrates round-off erros.
public class Demo9 {
   public static void main(String[] args) {
      System.out.println(100000 * 100000 * 100000);
      System.out.println(1.03 - 0.42);
      System.out.println(1.00 - 9 * .10);
      System.out.println((0.7 + 0.1) == (0.9 - 0.1));
   }
}