package q278_firstbadversion;

public class Main {
    public static int firstBadVersion(int n){
        return binarySearch(0,n);
    }

    public static int binarySearch(int left, int right){
        if (left >= right){
            return left;
        }
        int mid = (left+right) / 2;
        if (mid == 0){
            right = mid-1;
            return binarySearch(left,right);
        }
        left = mid+1;
        return binarySearch(left,right);
    }

    public static void main(String[] args){

    }
}
