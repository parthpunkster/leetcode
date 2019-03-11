package t1_q111_minimumdepthofbinarytree;

import punksterUtils_new.TreeNode;

public class T1_MinimumDepthofBinaryTree {
    public static int minDepth(TreeNode root){
        if (root == null) return 0;
        int depthofLeft = minDepth(root.left);
        int depthofRight = minDepth(root.right);
        return depthofLeft == 0 || depthofRight == 0 ? depthofLeft+depthofRight+1 : Math.min(depthofLeft,depthofRight)+1;
    }

    public static void main(String[] args){
        punksterUtils_new.TreeNode root = new punksterUtils_new.TreeNode(3);
        punksterUtils_new.TreeNode a = new punksterUtils_new.TreeNode(9);
        punksterUtils_new.TreeNode b = new punksterUtils_new.TreeNode(20);
        punksterUtils_new.TreeNode c = new punksterUtils_new.TreeNode(15);
        punksterUtils_new.TreeNode d = new punksterUtils_new.TreeNode(7);
        root.left = a;
        root.right = b;
        b.left = c;
        b.right = d;
        System.out.println(minDepth(root));
    }
}
