package t1_q303_rangesumqueryimmutable;

public class NumArray {
    int[] nums;
    int[] sum;
    public NumArray(int[] nums){
        this.nums = nums;
        sum = new int[nums.length+1];
        for (int i = 0 ; i<nums.length;i++){
            sum[i+1] = sum[i] + nums[i];
        }
    }

    public int sumRange(int i, int j){
        return sum[j+1]-sum[i];
    }
}
