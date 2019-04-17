package leetcode_amazon;

import punksterUtils_new.ArrayUtils;

import java.util.HashMap;

public class Q167_TwoSum2Inputarrayissorted {
    public static int[] twoSum(int[] numbers, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<numbers.length;i++){
            if (map.containsKey(target-numbers[i])) return new int[]{map.get(target-numbers[i])+1,i+1};
            map.putIfAbsent(numbers[i],i);
        }
        return new int[]{};
    }

    public static int[] twoSum_nomemory(int[] numbers, int target){
        int i = 0 ;
        int j = numbers.length-1;

        while (i<j){
            if (numbers[i]+numbers[j] == target) return new int[]{i+1,j+1};
            else if (numbers[i]+numbers[j]>target) j--;
            else i++;
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        ArrayUtils.printArray(twoSum_nomemory(new int[]{2,7,11,15},9));
    }
}
