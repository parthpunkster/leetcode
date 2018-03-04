package Q35_SearchInsertPosition;

public class Main {

    public static int searchInsert(int[] nums, int target) {
        int i = 0;
        for (i = 0;i <nums.length;i++) {
            if(target == nums[i] || target < nums[i]) {
                break;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        // write your code here
        int[] array = new int[] {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(array,target));
    }
}
