package q101_symmetrictree;

import punksterutils.TreeNode;

public class Main {

    public static boolean isSymmetric(TreeNode root){
        return isMirror(root,root);
    }

    public static boolean isMirror(TreeNode t1, TreeNode t2){
        if (t1 == null && t2 == null){
            return true;
        }
        if (t1 == null || t2 == null){
            return false;
        }
        if (t1.value == t2.value){
            return isMirror(t1.left,t2.right) && isMirror(t1.right,t2.left);
        }
        return false;
    }

    public static void main(String[] args){
        TreeNode a = new TreeNode(1);
        a.left = new TreeNode(2);
        a.right = new TreeNode(2);
        a.left.left = new TreeNode(3);
        a.left.right = new TreeNode(4);
        a.right.left = new TreeNode(4);
        a.right.right = new TreeNode(3);
        System.out.println(isSymmetric(a));
    }
}
