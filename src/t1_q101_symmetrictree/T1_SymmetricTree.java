package t1_q101_symmetrictree;

import punksterUtils_new.TreeNode;

public class T1_SymmetricTree {
    public static boolean isSymmetric(TreeNode root){
        return isMirror(root,root);
    }

    public static boolean isMirror(TreeNode left, TreeNode right){
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.value == right.value) return isMirror(left.left,right.right) && isMirror(left.right,right.left);
        return false;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode(3);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        System.out.println(isSymmetric(root));
    }
}
