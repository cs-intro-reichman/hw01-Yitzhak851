
public class TestRandom {
    public static void main(String[] args) {
        // Declrate variables
        int maxNum, minNum, randomNum, count;
        // getting number from user
        minNum = Integer.parseInt(args[0]);
        maxNum = Integer.parseInt(args[1]);
        count = 0;
        int[] arr = new int[3];
        while (count < 3) {
            randomNum = (int) (Math.random() * (maxNum - minNum + 1)) + minNum;
            System.out.println(randomNum);
            arr[count] = randomNum;
            count++;
        }
        // # Output:
        // # A random number between minNum (inclusive) and maxNum (inclusive)
        // Math.random() ==> [0.0, 1.0)*(154 - 54 +1) + 54 ==> (int)[0.0, 101.0)
        // get random num between [0-100] || [0-101)
        // 0+54 || 2+54 ....
        // Double - 16 numbers after the Dot(.)

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The minimal generated number was " + min);
    }
}
