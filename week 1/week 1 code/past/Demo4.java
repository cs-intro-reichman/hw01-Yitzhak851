// Illustrates "growing" a string
public class Demo4 {
    public static void main(String[] args) {
    String s = "1";     // "1"
    s = s + " 2 " + s;   // "1 2 1"
    s = s + " 3 " + s;   // "1 2 1 3 1 2 1"
    s = s + " 4 " + s;   // etc.
    System.out.println(s);
    }
}