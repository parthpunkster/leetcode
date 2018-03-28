package q100_sametree;

import punksterutils.TreeNode;

public class Main {

    public static boolean isSameTree(TreeNode p, TreeNode q){
        if (p == null && q == null){
            return true;
        }
        if (p == null || q == null){
            return false;
        }
        if (p.value == q.value){
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
        return false;
    }

    public static void main(String[] args){
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(1);
        a.right = new TreeNode(3);
        b.left = new TreeNode(2);
        b.right = new TreeNode(3);
        System.out.println(isSameTree(a,b));
    }
}
