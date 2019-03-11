package t1_q108_convertsortedarraytobinarysearchtree;

import punksterUtils_new.TreeNode;

import java.util.HashMap;

public class T1_ConvertSortedArraytoBinarySearchTree {
    public static TreeNode helperFunction(int left, int right, int[] nums){
        if (left > right) return null;
        int mid = left + (right - left)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helperFunction(left,mid-1,nums);
        root.right = helperFunction(mid+1,right,nums);
        return root;
    }

    public static TreeNode sortedArrayToBST(int[] nums){
        return helperFunction(0,nums.length-1,nums);
    }

    public static void main(String[] args){
        int[] nums = new int[]{-10,-3,0,5,9};
        System.out.println(sortedArrayToBST(nums));
    }
}
