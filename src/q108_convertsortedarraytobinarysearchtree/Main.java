package q108_convertsortedarraytobinarysearchtree;

import punksterutils.TreeNode;

import java.util.Arrays;

public class Main {


    public static TreeNode sortedArrayToBST(int[] nums){
        if (nums.length ==0){
            return null;
        }
        int start = 0;
        int end = nums.length-1;
        int mid = (start+end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums,0,mid));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums,mid+1,nums.length));
        return root;
    }

    public static void main(String[] args){
        int[] nums = new int[]{-10,-3,0,5,9};
        sortedArrayToBST(nums);
    }
}
