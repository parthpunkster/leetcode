package t1_q66_plusone;

import punksterUtils_new.ArrayUtils;

public class T1_PlusOne {
    public static int[] plusOne(int[] digits){
        int carry = 1;
        int i = digits.length-1;
        while(i >= 0 && carry == 1){
            digits[i] += carry;
            if (digits[i] == 10){
                digits[i] = 0;
                carry = 1;
            }
            else carry = 0;
            i--;
        }
        if (carry == 1){
            int[] tmp = new int[digits.length+1];
            tmp[0] = carry;
            for (i = 1 ; i< tmp.length; i++){
                tmp[i] = digits[i-1];
            }
            return tmp;
        }
        return digits;
    }

    public static void main(String[] args){
        int[] digits = new int[]{9};
        ArrayUtils.printArray(plusOne(digits));
    }
}
