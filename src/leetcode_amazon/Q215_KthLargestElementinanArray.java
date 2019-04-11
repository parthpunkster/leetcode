package leetcode_amazon;

import java.util.Random;

public class Q215_KthLargestElementinanArray {
    public static void swap(int [] nums, int index1, int index2){
        int tmp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = tmp;
    }

    public static int partition(int[] nums, int start, int end, int pivotIndex){
        swap(nums,pivotIndex,end);

        int startPointer = start;
        int pivot = nums[end];
        for (int i = start ; i <end;i++){
            if (nums[i]<pivot){
                swap(nums,i,startPointer);
                startPointer++;
            }
        }

        swap(nums,startPointer,end);
        return startPointer;
    }

    public static int quickSelect(int[] nums, int start, int end, int k){
        if (start == end) return nums[start];

        Random random = new Random();
        int pivotIndex = start + random.nextInt(end-start);

        pivotIndex = partition(nums,start,end,pivotIndex);
        if (nums.length - k == pivotIndex) return nums[pivotIndex];
        else if (nums.length-k > pivotIndex) return quickSelect(nums,pivotIndex+1,end,k);
        return quickSelect(nums,start,pivotIndex-1,k);
    }

    public static int findKthLargest(int[] nums, int k){
        return quickSelect(nums,0,nums.length-1,k);
    }

    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3,2,1,5,6,4},2));
    }
}
