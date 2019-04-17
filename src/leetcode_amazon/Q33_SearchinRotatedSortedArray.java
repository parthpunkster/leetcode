package leetcode_amazon;

public class Q33_SearchinRotatedSortedArray {
    public static int bs(int[] nums, int start, int end,int target){
        if (start>=end) {
            return nums[start] == target ? start:-1;
        }
        int mid = start + (end-start)/2;

        if(nums[mid] == target) return mid;
        else if(target<nums[mid] && nums[start]>= target) return bs(nums,start,mid-1,target);
        else if(target < nums[mid] && nums[start] < target) return bs(nums,mid+1,end,target);
        return bs(nums,mid+1,end,target);
    }

    public static int search(int[] nums, int target){
        return bs(nums,0,nums.length-1,target);
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{5,1,3},5));
    }
}
