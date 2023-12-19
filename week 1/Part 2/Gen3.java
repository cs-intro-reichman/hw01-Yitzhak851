public class Gen3 {
    public static void main(String[] args) {
        // Declrate variables
        int maxNum, minNum, randomNum, count;
        // getting number from user
        minNum = Integer.parseInt(args[0]);
        maxNum = Integer.parseInt(args[1]);
        count = 0;
        int[] arr = new int[3];
        while (count < 3) {
            randomNum = (int) (Math.random() * (maxNum - minNum)) + minNum;
            System.out.println(randomNum);
            arr[count] = randomNum;
            count++;
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The minimal generated number was " + min);
    }
}