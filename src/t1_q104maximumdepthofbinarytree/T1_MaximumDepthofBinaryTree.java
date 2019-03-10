package t1_q104maximumdepthofbinarytree;

import punksterUtils_new.TreeNode;

public class T1_MaximumDepthofBinaryTree {
    public static int maxDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
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
        System.out.println(maxDepth(root));
    }
}
