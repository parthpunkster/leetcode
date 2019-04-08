package t1_q404_sumofleftleaves;

import punksterUtils_new.TreeNode;

public class T1_SumofLeftLeaves {
    public static int supportFun(TreeNode root, char type){
        if (root.left == null && root.right==null){
            return type=='l' ? root.value : 0;
        }
        int sumleft = 0;
        int sumRight = 0;
        if (root.left != null) sumleft = supportFun(root.left,'l');
        if (root.right != null) sumRight = supportFun(root.right,'r');
        return sumleft+sumRight;
    }

    public static int sumOfLeftLeaves(TreeNode root){
        if (root == null) return 0;
        return supportFun(root,'r');
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(sumOfLeftLeaves(root));
    }
}
