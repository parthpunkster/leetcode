package q202_happynumber;

import java.util.HashSet;

public class Main {
    public static boolean isHappy(int n){
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(n);
        do {
            String digits = Integer.toString(n);
            int sum = 0;
            for (int i = 0; i < digits.length(); i++) {
                sum = sum + (int) Math.pow(Character.getNumericValue(digits.charAt(i)), 2);
            }
            if (sum == 1) {
                return true;
            }
            if (!set.add(sum)){
                return false;
            }
            n = sum;
        }
        while (n != 1);
        return false;
    }

    public static void main(String[] args){
        System.out.println(isHappy(2));
    }
}
