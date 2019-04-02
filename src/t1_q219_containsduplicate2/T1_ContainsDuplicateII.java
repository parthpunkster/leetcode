package t1_q219_containsduplicate2;

import java.util.HashMap;

public class T1_ContainsDuplicateII {
    public static boolean containNearbyDupliacte(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i <nums.length; i++){
            if (map.containsKey(nums[i]) && (i - map.get(nums[i])) <= k) return true;
            map.put(nums[i],i);
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(containNearbyDupliacte(new int[]{1,2,3,1},3));
    }
}
