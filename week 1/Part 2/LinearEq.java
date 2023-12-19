public class LinearEq {
    public static void main(String[] args) {
        double a,b,c, x;
        // getting number of cents
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        c = Double.parseDouble(args[2]);
        System.out.println( a + " * x + " + b + " = " + c );        
        c = c-b;
        x = c/a;
        System.out.println("X = " + x );
    }
}
