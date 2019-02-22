package t1_q9_palindromenumber;

public class T1_PalindromeNumber {
    public static boolean isPalindrome(int x){
        if (x < 0 || (x%10 == 0 && x !=0)) return false;

        int rev = 0;
        while (x > rev){
            rev = rev*10+x%10;
            x = x/10;
        }
        return x ==rev || x == rev/10;
    }

    public static void main(String[] args){
        int x = 121;
        System.out.println(isPalindrome(x));
    }
}
