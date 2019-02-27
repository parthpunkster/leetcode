package t1_q53_maximumsubarray;

public class T1_MaximumSubArray {
    public static int maxSubArray_Normal(int[] nums){
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];

        for (int i=1; i<nums.length;i++){
            maxEndingHere = Math.max(maxEndingHere+nums[i],nums[i]);
            maxSoFar = Math.max(maxEndingHere,maxSoFar);
        }
        return maxSoFar;
    }

//    Divide and conquer approach
    public static int maxSubArray_DAC(int[] nums, int left, int right){
        if (left == right) return nums[left];

        int mid = left + (right-left)/2;
        int maxSubLeft = maxSubArray_DAC(nums,left,mid);
        int maxSubRight = maxSubArray_DAC(nums,mid+1,right);
        int maxFromBoth = Math.max(maxSubLeft,maxSubRight);

        int sum = 0;
        int maxSumFromLeft = Integer.MIN_VALUE;
        for (int i = mid; i>=left;i--){
            sum += nums[i];
            maxSumFromLeft = Math.max(maxSumFromLeft,sum);
        }

        sum = 0;
        int maxSumFromRight = Integer.MIN_VALUE;
        for (int i = mid+1; i<= right;i++){
            sum += nums[i];
            maxSumFromRight = Math.max(maxSumFromRight,sum);
        }
        return Math.max(maxFromBoth,maxSumFromLeft+maxSumFromRight);
    }

    public static void main(String[] args){
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray_DAC(nums,0,nums.length-1));
    }
}
