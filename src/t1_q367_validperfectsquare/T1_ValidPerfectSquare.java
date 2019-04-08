package t1_q367_validperfectsquare;

public class T1_ValidPerfectSquare {
    public static boolean isPerfectSquare(int n){
        int left = 1;
        int right = n;
        while (left <= right){
            int mid = left + (right-left)/2;
            if (mid > n/mid) right = mid-1;
            else if(mid < n/mid) left = mid+1;
            else return n%mid==0;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(100));
    }
}
