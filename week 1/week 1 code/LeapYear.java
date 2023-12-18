public class LeapYear {
   public static void main(String[] args) {
      int year = Integer.parseInt(args[0]);
      boolean isLeapYear;

      // Checks if the year is divisible by 400
      isLeapYear = ((year % 400) == 0);

      // Then checks if the year is divisible by 4 but not by 100
      isLeapYear = isLeapYear || (((year % 4) == 0) && ((year % 100) != 0));
      
      System.out.println(isLeapYear);
   }
} 