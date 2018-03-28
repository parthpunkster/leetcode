package q7_reverseinteger;

import java.util.ArrayList;

public class Main {

    public static int reverse(int x) {
        boolean negative = false;
        if (x < 0) {
            x = Math.abs(x);
            negative = true;
        }

        ArrayList<Integer> tmp = new ArrayList<Integer>();
        int n = x;
        while (n != 0) {
            tmp.add(n%10);
            n = n/10;
        }
        StringBuilder result = new StringBuilder();
        if (negative == true) {
            result.append('-');
        }
        for (int k: tmp) {
            result.append(k);
        }
        int res;
        try {
            res = Integer.parseInt(result.toString());
        } catch (NumberFormatException ex) {
            return 0;
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println(reverse(153423649));
    }
}
