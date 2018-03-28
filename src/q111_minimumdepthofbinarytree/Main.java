package q111_minimumdepthofbinarytree;

import punksterutils.TreeNode;

public class Main {

    public static int minDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        int x = minDepth(root.left);
        int y = minDepth(root.right);
        return (x==0 || y==0)? x+y+1 : Math.min(x,y)+1;
    }

    public static void main(String[] args){
        TreeNode a = new TreeNode(3);
        a.left = new TreeNode(9);
//        a.right = new TreeNode(20);
//        a.right.left = new TreeNode(15);
//        a.right.right = new TreeNode(7);
        System.out.println(minDepth(a));
    }
}
