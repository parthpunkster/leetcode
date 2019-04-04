package t1_q235_lowestcommonancestorofabinarysearchtree;

import punksterUtils_new.TreeNode;

public class T1_CommonAncestorofaBinarySearchTree {
    public static TreeNode lowestCommonAncestor_recurssion(TreeNode root,TreeNode p, TreeNode q){
        if (p.value < root.value && q.value < root.value) return lowestCommonAncestor_recurssion(root.left,p,q);
        if (p.value > root.value && q.value > root.value) return lowestCommonAncestor_recurssion(root.right,p,q);
        return root;
    }

    public static TreeNode lowestCommonAncestor_iterative(TreeNode root, TreeNode p, TreeNode q){
        while (root.value !=  p.value && root.value != q.value){
            if (p.value < root.value && q.value < root.value) root = root.left;
            else if (p.value > root.value && q.value > root.value) root = root.right;
            else return root;
        }
        return root;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(6);
        TreeNode r1 = new TreeNode(2);
        TreeNode r2 = new TreeNode(8);
        root.left = r1;
        root.right = r2;
        r1.left = new TreeNode(0);
        TreeNode r3 = new TreeNode(4);
        r1.right = r3;
        r3.left = new TreeNode(3);
        r3.right = new TreeNode(5);
        r2.left = new TreeNode(7);
        r2.right = new TreeNode(9);
        System.out.println(lowestCommonAncestor_iterative(root,r1,r3).value);
    }
}
