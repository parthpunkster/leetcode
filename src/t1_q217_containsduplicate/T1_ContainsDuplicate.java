package t1_q217_containsduplicate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class T1_ContainsDuplicate {
    public static boolean containsDuplicate_usingSort(int[] nums){
        Arrays.sort(nums);
        for (int i = 0 ; i < nums.length-1;i++){
            if (nums[i] == nums[i+1]) return true;
        }
        return false;
    }

    public static boolean containsDuplicate_usingHashMap(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++){
            if (map.containsKey(nums[i])) return true;
            map.put(nums[i],1);
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(containsDuplicate_usingHashMap(new int[]{1,2,3,1}));
    }
}
