package t1_q100_sametree;

import punksterUtils_new.TreeNode;

public class T1_SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q){
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.value == q.value){
            return (isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
        }
        return false;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(isSameTree(root,root));
    }
}
