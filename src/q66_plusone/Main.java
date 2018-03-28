package q66_plusone;


public class Main {

    public static int[] plusOne(int[] digits){
        int carry = 1;
        for (int i =digits.length-1; i>=0;i--){
            int tmp = carry+digits[i];
            digits[i] = tmp%10;
            carry = tmp/10;
        }
        int[] tmp = new int[digits.length];
        int j =0;
        if (carry != 0){
            tmp = new int[digits.length+1];
            tmp[j] = carry;
            j++;
        }
        for (int i = 0; i<digits.length;i++){
            tmp[j] = digits[i];
            j++;
        }
        return tmp;
    }

    public static void main(String[] args){
        int[] array = new int[]{9};
        plusOne(array);
    }
}
