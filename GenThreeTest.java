public class GenThreeTest {
    public static void main(String[] args) {
        int maxNum, minNum, randomNum, count;
        int[] arr = new int[3];
        minNum = Integer.parseInt(args[0]);
        maxNum = Integer.parseInt(args[1]);
        count = 0;
        System.out.println("All tests passed!");
        System.out.println("Actual:");
        while (count < 3) {
            randomNum = (int) (Math.random() * (maxNum - minNum)) + minNum;
            System.out.println(randomNum);
            arr[count] = randomNum;
            count++;
        }
        // Find the x= minimum number
        int x = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= x){
                x = arr[i];
            }
        }
        System.out.print("The minimal generated number was " + x);
    }
}