public class Demo3 {
    public static void main(String[] args) {
        String s1 = "Tel";
        String s2 = "Aviv";
        System.out.println(s1 + s2);       // "TelAviv"  
        System.out.println(s2 + s1);       // "AvivTel"
        System.out.println(s1 + " " + s2); // "Tel Aviv"
        System.out.println(s1 + 3);        // "Tel3"
        System.out.println(6 + 5);         // 11
        System.out.println("6" + "5");     // "65"
        System.out.println("6" + 5);       // "65"
        System.out.println(5 + "6");       // "56"
        System.out.println(2 + " + " + 3 + " = " + (2 + 3)); // "2 + 3 = 5"
    }
}