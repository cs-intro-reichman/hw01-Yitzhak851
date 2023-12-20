public class Coins {
    public static void main(String[] args) {
        int coins,cent, quarters, numOfQuarters;
        quarters = 25;

        coins = Integer.parseInt(args[0]);
        numOfQuarters = coins / quarters ;
        cent = coins % quarters;
        System.out.println( "Use " + numOfQuarters + " quarters and " + cent + " cents");
    }
}
