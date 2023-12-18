public class Demo1 {
    public static void main(String[] args) {
        int x;         // state 0
        x = -13;       // state 1
        x = 25;        // state 2
        x = x + 1;     // state 3
        int y = x - 5; // state 4
    }
}