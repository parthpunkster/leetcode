package q217_containsduplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static boolean containsDuplicateUsingSorting(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i<nums.length-1; i++){
            if (nums[i] == nums[i+1]) return true;
        }
        return false;
    }

    public static boolean containsDuplicateUsingSet(int[] nums){
        Set<Integer> set = new HashSet<>(nums.length);
        for (int n:nums){
            if (set.contains(n)) return true;
            set.add(n);
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(containsDuplicateUsingSet(new int[]{1,2,3,1}));
    }
}
