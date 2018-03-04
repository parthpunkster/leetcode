package Q1_TwoSum;

public class Main {

    public static int[] twosum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i< nums.length; i++) {
            for (int j = i; j< nums.length;j++) {
                if (target-nums[i] == nums[j]) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }



    public static void main(String[] args) {
        // write your code here
        int[] array = new int[]{1,3,2,6};
        int[] result = twosum(array,4);
        for (int k: result) {
            System.out.println(k);
        }
    }
}
