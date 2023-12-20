public class LinearEq {
    public static void main(String[] args) {
        double a,b,c, x;
        a = Double.parseDouble(args[0]); // 1
        b = Double.parseDouble(args[1]); // 2
        c = Double.parseDouble(args[2]); // 1
        x = (c-b)/a; // x= (1-2) / 1
        System.out.println( a + " * x + " + b + " = " + c );
        System.out.println("x = " + x );
    }
}