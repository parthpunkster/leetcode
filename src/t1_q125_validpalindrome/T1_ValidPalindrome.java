package t1_q125_validpalindrome;

import java.util.regex.*;

public class T1_ValidPalindrome {
    public static boolean isPalindrome(String s){
        String s1 = s.toLowerCase().replaceAll("[^a-z0-9]+","");
        int mid = s1.length()/2;
        int i = 0;
        while (i < mid){
            if (s1.charAt(i) != s1.charAt(s1.length()-1-i)) return false;
            i++;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome("0P"));
    }
}
