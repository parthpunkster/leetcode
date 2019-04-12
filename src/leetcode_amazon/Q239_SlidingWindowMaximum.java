package leetcode_amazon;

import java.util.ArrayList;

public class Q239_SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k){
        if (nums == null || nums.length == 0) return new int[]{};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0 ; i+k<=nums.length;i++){
            int max = Integer.MIN_VALUE;
            for (int j = 0;j<k;j++){
                max = Math.max(max,nums[i+j]);
            }
            list.add(max);
        }

        int[] res = new int[list.size()];
        for (int i = 0 ; i <list.size();i++) res[i] = list.get(i);
        return res;
    }

    public static int[] maxSlidingWindow_dp(int[] nums, int k){
        if (nums.length == 0) return new int[]{};
        if (k == 1) return nums;
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = nums[0];
        right[nums.length-1] = nums[nums.length-1];

        for (int i =  1 ; i <nums.length;i++){
            if (i%k == 0) left[i] = nums[i];
            else left[i] = Math.max(left[i-1],nums[i]);
        }
        for (int i = nums.length-2;i>=0;i--){
            if ((i+1)%k == 0) right[i] = nums[i];
            else right[i] = Math.max(right[i+1],nums[i]);
        }

        int[] res = new int[nums.length-k+1];
        for (int i = 0 ; i<nums.length-k+1;i++){
            res[i] = Math.max(right[i],left[i+k-1]);
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3));
    }
}
