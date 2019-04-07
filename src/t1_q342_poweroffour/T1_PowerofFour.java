package t1_q342_poweroffour;

public class T1_PowerofFour {
    public static boolean isPowerOfFour(int n){
        if (n==0) return false;
        if (n==1) return true;
        if (n%4 ==0) return isPowerOfFour(n/4);
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }
}
