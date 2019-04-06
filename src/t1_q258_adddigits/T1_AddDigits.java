package t1_q258_adddigits;

public class T1_AddDigits {
    public static int addDigits_recurssion(int num){
        if (num/10 == 0) return num;
        int sum = 0;
        while (num != 0){
            sum = sum + num%10;
            num = num/10;
        }
        num = sum;
        return addDigits_recurssion(num);
    }

    public static int addDigits_direct(int num){
        if (num == 0) return num;
        if (num%9 ==0) return 9;
        return num%9;
    }

    public static void main(String[] args){
        System.out.println(addDigits_recurssion(38));
        System.out.println(addDigits_direct(38));
    }
}
