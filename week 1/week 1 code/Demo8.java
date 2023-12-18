public class Palindrome1 {
    public static void main(String[] args) {
        // Gets the string from the user:
        String s = args[0];
        boolean isPalindrome = true;
        int N = s.length();
        int mid = N / 2;
        for (int i = 0; i < mid; i++) {
            if (s.charAt(i) != s.charAt(N – i – 1)) {
                isPalindrome = false;
                break; // Can be used to exit any for / while loop
            }
        }    
        if (isPalindrome)
            System.out.println(s + " is a palindrome");
        else
            System.out.println(s + " is not a palindrome");
    }
}