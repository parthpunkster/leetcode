package t1_q169_majorityelement;

import java.util.Arrays;

public class T1_MajorityElement {
    public static int majorityElement(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }


    public static void main(String[] args){
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}
