public class Coins {
    public static void main(String[] args) {
        int quarters,  coins, numOfQuarters,numOfCent ;
        quarters = 25;
        coins = Integer.parseInt(args[0]);
        if (coins==0) {
            System.out.println("Please give positive number! ");
        }
        numOfQuarters = coins / quarters ;
        numOfCent = coins % quarters;
        System.out.println( "Use " + numOfQuarters + " quarters and " + numOfCent + " cents");
    }
}
