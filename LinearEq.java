public class LinearEq {
    public static void main(String[] args) {
        double a,b,c, x;
        a = Double.parseDouble(args[0]); // 1
        b = Double.parseDouble(args[1]); // 2
        c = Double.parseDouble(args[2]); // 1
        x = (c-b)/a; // x= (1-2) / 1
        System.out.printf("%.1f * x + %.1f = %.1f%n", a, b, c);
        System.out.printf("X = %.1f%n", x);
    }
}