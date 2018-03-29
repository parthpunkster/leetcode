package q125_validpalindrome;

public class Main {

    public static boolean isPalindrome(String s){
        String actual = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        String reverse = new StringBuilder(actual).reverse().toString();
        return actual.contentEquals(reverse);
    }

    public static void main(String[] args){
        String s = new String("A man, a plan, a canal: Panama");
        System.out.println(isPalindrome(s));
    }
}
