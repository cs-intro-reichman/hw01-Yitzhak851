public class Demo2 {
    public static void main(String[] args) {
        System.out.println(5 + 3);    // 8
        System.out.println(5 - 3); // 2
        System.out.println(5 * 3); // 15
        System.out.println(5 / 5); // 1
        System.out.println(5 % 3); // 2
        ////System.out.println(1 / 0); // Run-time error
        System.out.println(3 * 5 - 2);  // 13 (* has precedence)
        System.out.println(3 + 5 / 2);  // 5  (/ has precedence)
        System.out.println(3 - 5 - 2);  // -4 (- associates to the left)
        System.out.println((3 - 5) - 2); // -4 (better style)
        System.out.println(3 - (5 - 2)); // 0  (parentheses have precedence)
    }
}