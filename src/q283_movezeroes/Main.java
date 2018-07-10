package q283_movezeroes;

public class Main {
    public static void moveZeroes(int[] nums){
        for (int i = 0, j = 0; i<nums.length; i++){
            if (nums[i] != 0){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j++;
            }
        }
    }

    public static void main(String[] args){

    }
}
