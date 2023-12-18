// Illustrates the Math.random() function. 
public class Demo7 {
    public static void main(String[] args) {
        // prints a random value in [0,1)
        double x = Math.random();
        System.out.println(x);

        // prints a random value in [0,2)
        System.out.println(2.0 * Math.random()); 

        // prints a random value in [-1,+1)
        System.out.println(2.0 * Math.random() - 1.0);
    }
}
