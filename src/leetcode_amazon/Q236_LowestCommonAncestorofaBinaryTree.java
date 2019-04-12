package leetcode_amazon;

import punksterUtils_new.TreeNode;

public class Q236_LowestCommonAncestorofaBinaryTree {

    static TreeNode res = null;

    public static boolean dfs_lca(TreeNode root, TreeNode p, TreeNode q){
        if (root == null) return false;

        int mid = (root == p || root == q) ? 1:0;
        int left = dfs_lca(root.left,p,q) ? 1:0;
        int right = dfs_lca(root.right,p,q) ? 1:0;

        if (mid+left+right >=2) res = root;

        if(mid+left+right>0) return true;
        return false;
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        dfs_lca(root,p,q);
        return res;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        System.out.println(lowestCommonAncestor(root,root.left,root.right).value);
    }
}
