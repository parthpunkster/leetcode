package t1_q112_pathsum;

import punksterUtils_new.TreeNode;

public class T1_PathSum {
    public static boolean hasPathSum(TreeNode root, int sum){
        if (root == null) return false;
        if (root.left == null && root.right == null && sum-root.value == 0) return true;
        if (root == null && sum != 0) return false;
        return hasPathSum(root.left,sum-root.value) || hasPathSum(root.right,sum-root.value);
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(5);
        TreeNode a = new TreeNode(4);
        TreeNode b = new TreeNode(8);
        TreeNode c = new TreeNode(11);
        TreeNode d = new TreeNode(13);
        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode(7);
        TreeNode g = new TreeNode(2);
        TreeNode h = new TreeNode(1);
        root.left = a;
        root.right = b;
        b.left = c;
        c.left = f;
        c.right = g;
        d.left = f;
        d.right = g;
        e.right = h;
        System.out.println(hasPathSum(root,22));
    }
}
