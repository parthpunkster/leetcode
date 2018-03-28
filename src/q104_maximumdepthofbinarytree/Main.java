package q104_maximumdepthofbinarytree;

import punksterutils.TreeNode;

public class Main {

    public static int maxDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
    }

    public static void main(String[] args){
        TreeNode a = new TreeNode(3);
        a.left = new TreeNode(9);
        a.right = new TreeNode(20);
        a.right.left = new TreeNode(15);
        a.right.right = new TreeNode(7);
        System.out.println(maxDepth(a));
    }
}
