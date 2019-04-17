package leetcode_amazon;

import punksterUtils_new.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Q102_BinaryTreeLevelOrderTraversal {
    public static List<List<Integer>> levelOrder_iterative(TreeNode root){
        Queue<TreeNode> treeNodes = new LinkedBlockingQueue<>();
        Queue<Integer> level = new LinkedBlockingQueue<>();
        List<List<Integer>> result = new ArrayList<>();

        treeNodes.add(root);
        level.add(0);

        while (!treeNodes.isEmpty()){
            TreeNode currNode = treeNodes.poll();
            int currLevel = level.poll();
            if (currNode!=null){
                if (currLevel>=result.size()){
                    result.add(new ArrayList<>());
                }
                result.get(currLevel).add(currNode.value);
                if(currNode.left != null) {
                    treeNodes.add(currNode.left);
                    level.add(currLevel+1);
                }
                if (currNode.right != null) {
                    level.add(currLevel+1);
                    treeNodes.add(currNode.right);
                }
            }
        }
        return result;
    }

    static List<List<Integer>> res = new ArrayList<>();

    public static void helper_rec(TreeNode root, int level){
        if (root == null) return;

        if (level>=res.size()) res.add(new ArrayList<>());
        res.get(level).add(root.value);

        helper_rec(root.left,level+1);
        helper_rec(root.right,level+1);
    }

    public static List<List<Integer>> levelOrder_recurr(TreeNode root){
        helper_rec(root,0);
        return res;
    }

    public static void main(String[] args) {

    }
}
