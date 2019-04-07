package t1_q326_powerofthree;

public class T1_PowerofThree {
    public static boolean isPowerOfThree(int n){
        if (n==0) return false;
        if (n == 1) return true;
        if (n%3 != 0) return false;
        return isPowerOfThree(n/3);
    }

    public static void main(String[] args){
        for (int i = 0; i<=30;i++) {
            System.out.println(Integer.toString(i) + " : " +isPowerOfThree(i));
        }
    }
}
