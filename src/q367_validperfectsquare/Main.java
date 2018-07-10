package q367_validperfectsquare;

public class Main {
    public static boolean isPerfectSqaure(int num){
        if (num <= 0) return false;
        int left = 0, right =num;
        while (left <= right){
            int mid = left + (right-left)/2;
            if (mid > num/mid) right = mid-1;
            else if (mid < num/mid) left = mid+1;
            else return num%mid == 0;
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(isPerfectSqaure(-1));
    }
}
