package leetcode_amazon;

import punksterUtils_new.ArrayUtils;

import java.util.HashMap;

public class Q1_TwoSum {
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length;i++) map.put(nums[i],i);
        for (int i = 0 ; i <nums.length;i++){
            if (map.containsKey(target-nums[i])&& map.get(target-nums[i]) != i) return new int[]{i,map.get(target-nums[i])};
        }
        return new int[]{};
    }

    public static int[] twoSum_singlePass(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i <nums.length;i++){
            if (map.containsKey(target-nums[i])) return new int[]{map.get(target-nums[i]),i};
            map.put(nums[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        ArrayUtils.printArray(twoSum(new int[]{7,7,11,15},14));
    }
}
