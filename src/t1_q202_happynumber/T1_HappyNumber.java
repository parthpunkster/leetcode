package t1_q202_happynumber;

import java.util.HashSet;

public class T1_HappyNumber {
    public static boolean isHappy(int n){
        HashSet<Integer> set = new HashSet<>();
        while (!set.contains(n)){
            set.add(n);
            if (n == 1) return true;
            int tmp = 0;
            while (n != 0){
                tmp += Math.pow(n % 10,2);
                n = n/10;
            }
            n = tmp;
        }
        return false;
    }


    public static void main(String[] args){
        System.out.println(isHappy(19));
    }
}
