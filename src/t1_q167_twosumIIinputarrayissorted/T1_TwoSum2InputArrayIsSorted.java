package t1_q167_twosumIIinputarrayissorted;

import punksterUtils_new.ArrayUtils;

public class T1_TwoSum2InputArrayIsSorted {
    public static int[] twoSum(int[] numbers, int target){
        int left = 0;
        int right = numbers.length-1;

        while (left < right){
            int sum = numbers[left] + numbers[right];
            if (sum == target) return new int[]{left+1,right+1};
            if (sum < target) left++;
            else right--;
        }
        return new int[]{};
    }

    public static void main(String[] args){
        ArrayUtils.printArray(twoSum(new int[]{2,7,11,15},9));
    }
}
