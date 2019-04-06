package t1_q263_uglynumber;

public class T1_UglyNumber {
    public static boolean isUgly(int num){
        if (num == 0) return false;
        if (num == 1) return true;
        if (num % 2 ==0) return isUgly(num/2);
        else if (num%3 == 0) return isUgly(num/3);
        else if (num%5 == 0) return isUgly(num/5);
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isUgly(-2147483648));
    }
}
