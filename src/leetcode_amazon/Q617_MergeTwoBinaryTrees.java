package leetcode_amazon;

import punksterUtils_new.TreeNode;

public class Q617_MergeTwoBinaryTrees {
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2){
        if (t1 == null && t2 == null) return null;
        int v1 = 0;
        int v2 = 0;
        if (t1 != null) v1 = t1.value;
        if (t2 != null) v2 = t2.value;

        TreeNode head = new TreeNode(v1+v2);
        if (t1 == null){
            head.left = mergeTrees(t1,t2.left);
            head.right = mergeTrees(t1,t2.right);
        } else if (t2 == null) {
            head.left = mergeTrees(t1.left,t2);
            head.right = mergeTrees(t1.right,t2);
        }
        else {
            head.left = mergeTrees(t1.left,t2.left);
            head.right = mergeTrees(t1.right,t2.right);
        }
        return head;
    }


    public static void main(String[] args) {

    }
}
