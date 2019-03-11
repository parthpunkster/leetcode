package t1_q110_balancedbinarytree;

import punksterUtils_new.TreeNode;

public class T1_BalancedBinaryTree {
    public static int heightOfTree(TreeNode root){
        if (root == null) return 0;
        int leftHeight = heightOfTree(root.left);
        if (leftHeight == -1) return -1;
        int rightHeight = heightOfTree(root.right);
        if (rightHeight == -1) return -1;
        return Math.abs(leftHeight-rightHeight) <=1 ? Math.max(heightOfTree(root.left),heightOfTree(root.right))+1: -1;
    }

    public static boolean isBalanced(TreeNode root){
        return heightOfTree(root) == -1 ? false:true;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        TreeNode a = new TreeNode(9);
        TreeNode b = new TreeNode(20);
        TreeNode c = new TreeNode(15);
        TreeNode d = new TreeNode(7);
        root.left = a;
        root.right = b;
        b.left = c;
        b.right = d;
        System.out.println(isBalanced(root));
    }
}
