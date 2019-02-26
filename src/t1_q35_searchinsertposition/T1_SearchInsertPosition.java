package t1_q35_searchinsertposition;

public class T1_SearchInsertPosition {
    public static int searcInsert(int[] nums, int target){
        int i = 0;
        while (i<nums.length && nums[i] != target && nums[i] < target){
            i++;
        }
        return i;
    }

    public static void main(String[] args){
        int[] nums = new int[]{};
        System.out.println(searcInsert(nums,0));
    }
}
