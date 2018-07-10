package q235_lowestcommonancestorofabinarysearchtree;


import punksterutils.TreeNode;

public class Main {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if (root == null || p == null || q==null){
            return null;
        }
        if (root.value == p.value || root.value == q.value) return root;
        TreeNode leftSide = lowestCommonAncestor(root.left,p,q);
        TreeNode rightSide = lowestCommonAncestor(root.right,p,q);

        if (leftSide == null) return rightSide;

        if (rightSide == null) return leftSide;

        return root;

    }

    public static void main(String[] args){
        TreeNode head = new TreeNode(6);
        head.left = new TreeNode(2);
        head.left.left = new TreeNode(0);
        head.left.right = new TreeNode(4);
        head.left.right.left = new TreeNode(3);
        head.left.right.right = new TreeNode(5);
        head.right = new TreeNode(8);
        head.right.left = new TreeNode(7);
        head.right.right = new TreeNode(9);
        System.out.println(lowestCommonAncestor(head, new TreeNode(2),new TreeNode(8)).value);
    }
}
