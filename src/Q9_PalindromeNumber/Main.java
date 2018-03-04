package Q9_PalindromeNumber;

public class Main {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        int n=x;
        StringBuilder str = new StringBuilder();
        while (n != 0) {
            str.append(n%10);
            n = n/10;
        }
        try {
            if (Integer.parseInt(str.toString()) == x) {
                return true;
            }
        } catch (java.lang.NumberFormatException ex) {
            return false;
        }
        return false;
    }

    public static boolean isPalindrome1(int x) {
        int revert = 0;
        while (x > revert) {
            revert = revert*10 + x%10;
            x = x/10;
        }
        return (x == revert || x == revert/10);
    }

    public static void main(String[] args) {
        // write your code here
        if (isPalindrome(12321)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a plaindrome");
        }
    }
}
