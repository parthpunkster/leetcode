package t1_q7_reverseinteger;

public class T1_ReverseInteger {
    public static int reverse(int x){
        int n = x;
        int rev = 0;
        while (n != 0){
            int pop = n % 10;
            n = n/10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE && pop < -8)) return 0;
            rev = rev*10+pop;
        }
        return rev;
    }

    public static void main(String[] args){
        int x = -123;
        System.out.println(reverse(x));

    }
}
