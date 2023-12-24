/**
 * This class contain a "Coins" mission.
 * 
 * @author (Yitzhak baror)
 * @version (21.12.2023)
 */
public class Coins {
    public static int calcNumOfQuarters(int a, int b) {
        int numOfQuarters = a / b;
        return numOfQuarters;
    }
    public static void main(String[] args) {
        // Declrate variables
        int quarters, coins, numOfQuarters, numOfCent;
        quarters = 25;
        // Getting values from the user
        coins = Integer.parseInt(args[0]);
        // Calculate the result
        numOfQuarters = calcNumOfQuarters(coins, quarters);
        numOfCent = coins % quarters;
        // Print the result
        System.out.println("Use " + numOfQuarters + " quarters and " + numOfCent + " cents");
    }
}