package leetcode_amazon;

import punksterUtils_new.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q103_BinaryTreeZigzagLevelOrderTraversal {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root){
        if(root == null) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Stack<TreeNode> currLevel = new Stack<>();
        Stack<TreeNode> nextLevel = new Stack<>();
        int level = 0;
        boolean left = true;
        currLevel.add(root);


        while (!currLevel.isEmpty()){
            TreeNode node = currLevel.pop();

            if (level == res.size()) res.add(new ArrayList<>());
            res.get(level).add(node.value);

            if(left){
                if (node.left!= null) nextLevel.add(node.left);
                if(node.right != null) nextLevel.add(node.right);
            }
            else {
                if(node.right != null) nextLevel.add(node.right);
                if(node.left != null) nextLevel.add(node.left);
            }

            if(currLevel.isEmpty()){
                currLevel = nextLevel;
                nextLevel = new Stack<>();
                level++;
                left = !left;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(zigzagLevelOrder(root));
    }
}
