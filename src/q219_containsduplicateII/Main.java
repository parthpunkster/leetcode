package q219_containsduplicateII;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static boolean containsNearbyDuolicate(int[] nums, int k){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
            if (map.containsKey(nums[i]) && i-map.get(nums[i]) <= k) return true;
            map.put(nums[i],i);
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(containsNearbyDuolicate(new int[]{1,2,3,1,2,3},2));
    }
}
