// Illustrates expressions that use double values.
public class Demo6 {
    public static void main(String[] args) {
    System.out.println(3.141 + .03);     // 3.171
    System.out.println(3.141 - .03);     // 3.111
    System.out.println(6.02e23 / 2);     // 3.01E23
    System.out.println(5.0 / 2.0);       // 2.5
    System.out.println(5 / 2);           // 2
    System.out.println(5.0 / 2);         // 2.5
    System.out.println(5 / 2.0);         // 2.5
    System.out.println(1 / 3);           // 0
    System.out.println(1.0 / 3.0);       // 0.3333333333333333
    System.out.println(1.0 / 0.0);       // Infinity
    ////System.out.println(1 / 0);           // Runtime error
    System.out.println(Math.sqrt(2.0));  // 1.4142135623730951
    System.out.println(Math.sqrt(-1.0)); // NaN
    }
}