package q110_balancedbinarytree;

import punksterutils.TreeNode;

public class Main {

    public static int helperIsBalanced(TreeNode root){
        if (root == null){
            return 0;
        }
        int leftHeight = helperIsBalanced(root.left);
        if (leftHeight == -1){
            return -1;
        }
        int rightHeight = helperIsBalanced(root.right);
        if (rightHeight == -1){
            return -1;
        }
        return Math.abs(leftHeight-rightHeight) <= 1 ? Math.max(leftHeight,rightHeight)+1:-1;
    }

    public static boolean isBalanced(TreeNode root){
        if (root == null){
            return true;
        }
        return helperIsBalanced(root) != -1 ? true : false;
    }

    public static void main(String[] args){
        TreeNode a = new TreeNode(3);
        a.left = new TreeNode(9);
        a.right = new TreeNode(20);
        a.right.left = new TreeNode(15);
        a.right.right = new TreeNode(7);
        System.out.println(isBalanced(a));
    }

}
