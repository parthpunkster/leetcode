package q169_majorityelement;

import java.util.Arrays;

public class Main {

    public static int majorityElement(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static void main(String[] args){
        int[] array = new int[]{1,1,2,1,1};
        System.out.println(majorityElement(array));
    }
}
