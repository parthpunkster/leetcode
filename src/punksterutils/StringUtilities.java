package punksterutils;

public class StringUtilities {

    public static String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }

    public static boolean isPalindrome(String s){
        return s.contentEquals(reverse(s));
    }
}
