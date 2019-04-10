package leetcode_amazon;

import punksterUtils_new.ArrayUtils;

public class Q238_ProductofArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums){
        int[] leftProd = new int[nums.length];
        int[] rightProd = new int[nums.length];

        leftProd[0] = 1;
        rightProd[rightProd.length-1] = 1;
        for (int i = 1 ; i<nums.length;i++){
            leftProd[i] = leftProd[i-1] * nums[i-1];
        }
        for(int i = nums.length-2;i>=0;i--){
            rightProd[i] = rightProd[i+1]*nums[i+1];
        }
        int[] res = new int[nums.length];
        for (int i = 0 ; i < nums.length;i++){
            res[i] = leftProd[i]*rightProd[i];
        }
        return res;
    }

    public static int[] productExceptSelf_opt(int[] nums){
        int[] res = new int[nums.length];

        res[0] = 1;
        for (int i = 1 ; i <nums.length; i++){
            res[i] = res[i-1] * nums[i-1];
        }
        int rightVal = 1;
        for(int i = nums.length-1;i>=0;i--){
            res[i] = rightVal*res[i];
            rightVal = rightVal*nums[i];
        }
        return res;
    }


    public static void main(String[] args) {
        ArrayUtils.printArray(productExceptSelf_opt(new int[]{1,2,3,4}));
    }
}
