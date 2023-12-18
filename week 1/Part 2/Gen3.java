/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */



// % java Gen3 10 15
// 14
// 11
// 10
// The minimal generated number was 10

// % java Gen3 10 15
// 12
// 12
// 14
// The minimal generated number was 12
// % java Gen3 90 200
// 198
// 95
// 112
// The minimal generated number was 95
// If you want, you can use Java’s Math.min() method (at this stage of the course, we use the
// terms method and function interchangeably).

public class Gen3 {
    public static void main(String[] args) {
        // Declrate
        int maxNum,minNum;
        // getting number from user
        minNum = Integer.parseInt(args[0]);
        maxNum = Integer.parseInt(args[1]);
        

        Math.min(minNum, maxNum);
        System.out.println( "Use " + quarters + " quarters and " + cent + " cents");
    }
}
