package leetcode_amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q15_3Sum {
    public static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0 ; i<nums.length-2;i++){
            if (i == 0 || (i>0 && nums[i] != nums[i-1])) {
                int lo = i + 1;
                int hi = nums.length - 1;
                int sum = 0 - nums[i];
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) {
                        List<Integer> tmp = new ArrayList<>();
                        tmp.add(nums[i]);
                        tmp.add(nums[lo]);
                        tmp.add(nums[hi]);
                        result.add(tmp);
                        while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
                        while (lo < hi && nums[hi] == nums[hi - 1]) hi--;
                        lo++;
                        hi--;
                    } else if (nums[lo] + nums[hi] > sum) hi--;
                    else lo++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
