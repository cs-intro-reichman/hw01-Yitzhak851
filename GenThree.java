/**
 * This class contain a "GenThree" mission.
 * 
 * @author (Yitzhak baror)
 * @version (20.12.2023)
 */
public class GenThree {
    public static void main(String[] args) {
        // Declrate variables
        int x, y, maxNum, minNum, randomNum;
        // Getting values from the user
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        // Calculate min && max number
        minNum = Math.min(x, y);
        maxNum = Math.max(x, y);
        // Create array with the values of the randomNum*3
        int[] arr = new int[3];
        // Loop that print the 3 random numbers
        for (int i = 0; i < arr.length; i++) {
            randomNum = (int) (Math.random() * (maxNum - minNum)) + minNum;
            System.out.println(randomNum);
            arr[i] = randomNum;
        }
        // Calculate the min number from the 3 random num
        int minGeneratedNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= minGeneratedNum) {
                minGeneratedNum = arr[i];
            }
        }
        // Print the result
        System.out.println("The minimal generated number was " + x);
    }
}