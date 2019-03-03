package t1_q67_addbinary;

import java.lang.StringBuilder;

public class T1_AddBinary {
    public static String addBinary(String a, String b){
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (i >= 0 && j >= 0){
            int sum = Integer.parseInt( Character.toString(a.charAt(i))) + Integer.parseInt( Character.toString(b.charAt(j))) + carry;
            result.append(sum%2);
            carry = sum/2;
            i--;
            j--;
        }

        while (i >=0){
            int sum = Integer.parseInt( Character.toString(a.charAt(i))) + carry;
            result.append(sum%2);
            carry = sum/2;
            i--;
        }

        while (j >=0){
            int sum = Integer.parseInt( Character.toString(b.charAt(j))) + carry;
                result.append(sum%2);
                carry = sum/2;
                j--;
        }
        if (carry == 1){
            result.append(carry);
            carry=0;
        }
        return result.reverse().toString();
    }


    public static void main(String[] args){
        System.out.println(addBinary("1","111"));
    }
}
