package q112_pathsum;

import punksterutils.TreeNode;

public class Main {

    public static boolean hasPathSum(TreeNode root, int sum){
        if (root == null){
            return false;
        }
        if (root.left == null && root.right == null && sum - root.value == 0){
            return true;
        }
        return hasPathSum(root.left,sum-root.value) || hasPathSum(root.right,sum-root.value);
    }

    public static void main(String[] args){
        TreeNode a = new TreeNode(1);
        a.right = new TreeNode(2);
        System.out.println(hasPathSum(a,1));
    }
}
