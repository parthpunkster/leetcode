package Q53_MaximumSubarray;

public class Main {
//    public static int maxSubArray(int[] A) {
//        int maxSoFar=A[0], maxEndingHere=A[0];
//        for (int i=1;i<A.length;++i){
//            maxEndingHere= Math.max(maxEndingHere+A[i],A[i]);
//            maxSoFar=Math.max(maxSoFar, maxEndingHere);
//        }
//        return maxSoFar;
//    }

    public static int maxSubArray(int[] nums) {
        return Subarray(nums, 0 ,nums.length -1 );
    }
    public static int Subarray(int[] A,int left, int right){
        if(left == right){return A[left];}
        int mid = left + (right - left) / 2;
        int leftSum = Subarray(A,left,mid);// left part
            int rightSum = Subarray(A,mid+1,right);//right part
        int crossSum = crossSubarray(A,left,right);// cross part
        if(leftSum >= rightSum && leftSum >= crossSum){// left part is max
            return leftSum;
        }
        if(rightSum >= leftSum && rightSum >= crossSum){// right part is max
            return rightSum;
        }
        return crossSum; // cross part is max
    }
    public static int crossSubarray(int[] A,int left,int right){
        int leftSum = Integer.MIN_VALUE;
        int rightSum = Integer.MIN_VALUE;
        int sum = 0;
        int mid = left + (right - left) / 2;
        for(int i = mid; i >= left ; i--){
            sum = sum + A[i];
            if(leftSum < sum){
                leftSum = sum;
            }
        }
        sum = 0;
        for(int j = mid + 1; j <= right; j++){
            sum = sum + A[j];
            if(rightSum < sum){
                rightSum = sum;
            }
        }
        return leftSum + rightSum;
    }

    public static void main(String[] args) {
        int[] array = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(array));
    }
}
