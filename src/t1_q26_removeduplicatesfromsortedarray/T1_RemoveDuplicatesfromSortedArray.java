package t1_q26_removeduplicatesfromsortedarray;

public class T1_RemoveDuplicatesfromSortedArray {
    public static int removeDuplicatesfromSortedArray(int[] nums){
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j<nums.length;j++){
            if (nums[i] != nums[j]){
                nums[++i] = nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args){
        System.out.println(removeDuplicatesfromSortedArray(new int[]{1,1,2,2,2,2,2,3,3,4}));
    }
}
