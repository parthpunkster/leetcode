package t1_q198_houserobber;

import java.util.Arrays;

public class T1_HouseRobber {
    public static int rob_recurssion_bruteforce(int[] nums){
        return helper_rob_recurssion_bruteforce(nums, nums.length-1);
    }

    public static int helper_rob_recurssion_bruteforce(int[] nums, int end){
        if (end < 0) return 0;
        int tmp = Math.max(nums[end]+helper_rob_recurssion_bruteforce(nums,end-2),helper_rob_recurssion_bruteforce(nums,end-1));
        return tmp;
    }
//    ------------------------------------

    static int[] mem_recurssion;

    public static int rob_recurssion_memo(int[] nums){
        mem_recurssion = new int[nums.length];
        Arrays.fill(mem_recurssion,-1);
        return helper_rob_recurssion_memoization(nums,nums.length-1);
    }


    public static int helper_rob_recurssion_memoization(int[] nums, int end){
        if (end < 0) return 0;

        if (mem_recurssion[end] >= 0) return mem_recurssion[end];

        int tmp = Math.max(nums[end]+helper_rob_recurssion_memoization(nums,end-2),helper_rob_recurssion_memoization(nums,end-1));
        mem_recurssion[end] = tmp;
        return tmp;
    }

//    --------------------------------------

    public static int rob_iterative_memo(int[] nums){
        if (nums.length == 0) return 0;

        int[] mem_iterative = new int[nums.length+1];
        mem_iterative[0] = 0;
        mem_iterative[1] = nums[0];


        for(int i = 1 ; i < nums.length;i++){
            int tmp = nums[i];
            mem_iterative[i+1] = Math.max(tmp+mem_iterative[i-1],mem_iterative[i]);
        }
        return mem_iterative[nums.length];
    }

//    --------------------------------------

    public static int rob_iterative_dyanmicprogramming(int[] nums){
        if (nums.length == 0) return 0;

        int rob = 0;
        int notrob = 0;

        for(int n : nums){
            int cur = notrob + n;
            notrob = Math.max(rob,notrob);
            rob = cur;
        }
        return Math.max(rob,notrob);
    }

    public static void main(String[] args){
        System.out.println(rob_iterative_dyanmicprogramming(new int[]{1,2,3,1}));
    }
}
