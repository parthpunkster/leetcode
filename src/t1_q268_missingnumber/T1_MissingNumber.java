package t1_q268_missingnumber;

public class T1_MissingNumber {
    public static int missingNumber(int[] nums){
        int sum = nums.length * (nums.length+1)/2;
        for (int num : nums){
            sum -= num;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0,1}));
    }
}
