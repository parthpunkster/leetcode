package q229_majorityelementII;

import java.util.ArrayList;
import java.util.List;

public class Q229_MajorityElementII {
    public static List<Integer> majorityElement(int[] nums){
        if (nums == null) return null;
        List<Integer> res = new ArrayList<>();
        int c1 =0, c2 = 0, num1 = 0, num2 = 1;
        for (int i = 0 ; i<nums.length;i++){
            if (nums[i] == num1)c1++;
            else if (nums[i] == num2) c2++;
            else if (c1 == 0) {
                num1 = nums[i];
                c1++;
            }
            else if (c2 == 0){
                num2 = nums[i];
                c2++;
            }
            else {
                c1--;
                c2--;
            }
        }

        c1 = 0;
        c2 = 0;
        for (int n : nums){
            if (n == num1) c1++;
            else if (n == num2) c2++;
        }

        if (c1 > nums.length/3) res.add(num1);
        if (c2>nums.length/3) res.add(num2);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(null));
    }

}
