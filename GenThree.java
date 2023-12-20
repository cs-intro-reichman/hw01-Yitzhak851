public class GenThree {
    public static void main(String[] args) {
        int maxNum, minNum, randomNum;
        int[] arr = new int[3];
        minNum = Integer.parseInt(args[0]);
        maxNum = Integer.parseInt(args[1]);
        for(int i=0; i<arr.length ; i++){
            randomNum = (int) (Math.random() * (maxNum - minNum)) + minNum;
            System.out.println(randomNum);
            arr[i] = randomNum;
        }
        // Find x=minimum number
        int x = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= x){

                x = arr[i];
            }
        }
        System.out.println("The minimal generated number was " + x);
    }
}