package t1_q226_invertbinarytree;

import punksterUtils_new.TreeNode;

public class T1_InvertBinaryTree {
    public static TreeNode invertTree_recurssion(TreeNode root){
        if (root == null) return root;
        TreeNode left = invertTree_recurssion(root.left);
        TreeNode right = invertTree_recurssion(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public static void main(String[] args){

    }
}
