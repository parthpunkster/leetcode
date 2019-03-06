package t1_q69_sqrtx;

public class T1_Sqrtx {
    public static int sqrtOfX_BinarySearch(int x){
        if (x == 0) return 0;
        int i = 1;
        int j = x;

        while (i <= j){
            int mid = i + (j-i)/2;
            if ((mid <= (x / mid)) && ((mid+1) > (x / (mid+1)))) return mid;
            else if (mid < (x /mid)) i = mid+1;
            else j = mid-1;
        }
        return -1;
    }

    public static int sqrtOfX(int x){
        long r = x;
        while (r*r > x){
            r = (r + x/r)/2;
        }
        return (int)r;
    }

    public static void main(String[] args){
        System.out.println(sqrtOfX(4));
    }
}
