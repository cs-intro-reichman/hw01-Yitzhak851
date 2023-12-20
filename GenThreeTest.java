public class GenThreeTest {
    public static void main(String[] args) {
        int maxNum, minNum, randomNum, count;
        int[] arr = new int[3];
        minNum = Integer.parseInt(args[0]);
        maxNum = Integer.parseInt(args[1]);
        count = 0;
        while (count < 3) {
            randomNum = (int) (Math.random() * (maxNum - minNum)) + minNum;
            System.out.print(randomNum);
            arr[count] = randomNum;
            count++;
        }
        System.out.println();
        int x = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= x){
                x = arr[i];
            }
        }
        System.out.print("The minimal generated number was " + min);
    }
}