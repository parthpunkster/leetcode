package t1_q1_twosum;

import punksterUtils_new.ArrayUtils;

import java.util.HashMap;

public class T1_TwoSum {
    public static int[] bruteForceTwoSum(int[] array, int target){
        for (int i = 0 ; i < array.length-1 ; i++){
            int remaining = target - array[i];
            for (int j = i+1 ; j < array.length;j++){
                if (remaining == array[j]){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("Sum not possible");
    }

    public static int[] optimizedTwoSum(int[] array, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i<array.length; i++){
            map.put(array[i],i);
        }
        for (int i = 0 ; i<array.length;i++){
            int remaining = target-array[i];
            if (map.containsKey(remaining)&& map.get(remaining) != i){
                return new int[]{i,map.get(remaining)};
            }
        }
        throw new IllegalArgumentException("Sum not possible");
    }

    public static int[] optimizedTwoSum1(int[] array, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i <array.length;i++){
            int remaining = target-array[i];
            if (map.containsKey(remaining) && map.get(remaining) != i){
                return new int[]{map.get(remaining),i};
            }
            map.put(array[i],i);
        }
        throw new IllegalArgumentException("Sum not possible");
    }

    public static void main(String[] args){
        int[] array  = new int[]{2,7,11,15};
        int target = 9;
        int[] result = optimizedTwoSum1(array,target);
        ArrayUtils.printArray(result);
    }
}
