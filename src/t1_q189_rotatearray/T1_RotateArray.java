package t1_q189_rotatearray;

import punksterUtils_new.ArrayUtils;

public class T1_RotateArray {
    public static void reverseArray(int[] nums,int start, int end){
        while (start < end){
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }

    public static void rotate(int[] nums, int k){
        reverseArray(nums,0,nums.length-1);
        reverseArray(nums,0,(k%nums.length)-1);
        reverseArray(nums,k%nums.length,nums.length-1);
    }

    public static void main(String[] args){
        int[] nums = new int[]{1};
        rotate(nums,2);
        ArrayUtils.printArray(nums);
    }
}
