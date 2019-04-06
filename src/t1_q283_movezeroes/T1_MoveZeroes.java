package t1_q283_movezeroes;

import punksterUtils_new.ArrayUtils;

public class T1_MoveZeroes {
    public static void moveZeroes(int[] nums){
        for (int i = 0,j=0; j<nums.length;j++){
            if (nums[j] != 0){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{0,1,0,3,1,2};
        moveZeroes(array);
        ArrayUtils.printArray(array);
    }
}
