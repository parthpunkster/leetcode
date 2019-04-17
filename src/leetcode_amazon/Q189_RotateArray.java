package leetcode_amazon;

import punksterUtils_new.ArrayUtils;

public class Q189_RotateArray {
    public static void reverse(int[] nums, int start, int end){
        int mid =start+(end+1-start)/2;
        for (int i = start; i < mid;i++){
            int tmp = nums[i];
            nums[i] = nums[end];
            nums[end--] = tmp;
        }
    }

    public static void rotate(int[] nums, int k){
        int modifiedK = k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,modifiedK-1);
        reverse(nums,modifiedK,nums.length-1);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1};
        rotate(nums,0);
        ArrayUtils.printArray(nums);
    }
}
