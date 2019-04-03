package t1_231_poweroftwo;

public class T1_PowerofTwo {
    public static boolean isPower_iterative(int n){
        if (n==0) return false;
        while (n != 1){
            if (n%2 != 0) return false;
            n = n/2;
        }
        return true;

    }

    public static boolean isPower_recurssive(int n){
        if (n == 0) return false;
        if (n == 1) return true;
        return isPower_recurssive(n/2);
    }

    public static void main(String[] args){
        System.out.println(isPower_recurssive(2));
    }
}
