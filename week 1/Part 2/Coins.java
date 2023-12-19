public class Coins {
    public static void main(String[] args) {
        int coins,cent, quarters;
        quarters = 25;
        // getting number of cents
        coins = Integer.parseInt(args[0]); // a = ( % java Coins 50 )
        quarters = coins / quarters ;
        cent = coins % quarters;
        System.out.println( "Use " + quarters + " quarters and " + cent + " cents");
    }
}
