package leetcode_amazon;

import punksterUtils_new.TreeNode;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class Q199_BinaryTreeRightSideView {
    public static List<Integer> rightSideView_dfs(TreeNode root){
        if (root == null) return new ArrayList<>();
        Stack<TreeNode> nodesToBeVisited = new Stack<>();
        Stack<Integer> levelForNodes = new Stack<>();
        int maxDepth = -1;
        Map<Integer,TreeNode> map = new HashMap<>();

        nodesToBeVisited.add(root);
        levelForNodes.add(0);

        while (!nodesToBeVisited.isEmpty()){
            TreeNode currNode = nodesToBeVisited.pop();
            int currDepth = levelForNodes.pop();
            if (currNode != null){
                maxDepth = Math.max(currDepth,maxDepth);
                if (!map.containsKey(currDepth)) map.put(currDepth,currNode);
                nodesToBeVisited.add(currNode.left);
                nodesToBeVisited.add(currNode.right);
                levelForNodes.add(currDepth+1);
                levelForNodes.add(currDepth+1);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int depth = 0 ; depth <=maxDepth;depth++){
            result.add(map.get(depth).value);
        }
        return result;
    }


    public static List<Integer> rightSideView_bfs(TreeNode root){
        if (root == null) return new ArrayList<>();
        Queue<TreeNode> nodesToBeVisited = new LinkedBlockingQueue<>();
        Queue<Integer> depthofNodes = new LinkedBlockingQueue<>();

        Map<Integer,Integer> map = new HashMap<>();
        int maxDepth = -1;

        nodesToBeVisited.add(root);
        depthofNodes.add(0);

        while (!nodesToBeVisited.isEmpty()){
            TreeNode currNode = nodesToBeVisited.poll();
            int currDepth = depthofNodes.poll();

            if (currNode != null){
                maxDepth = Math.max(maxDepth,currDepth);
                map.putIfAbsent(currDepth,currNode.value);

                if(currNode.right != null){
                    nodesToBeVisited.add(currNode.right);
                    depthofNodes.add(currDepth+1);
                }
                if(currNode.left != null) {
                    nodesToBeVisited.add(currNode.left);
                    depthofNodes.add(currDepth + 1);
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for(int i = 0 ; i <=maxDepth;i++){
            result.add(map.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);

        System.out.println(rightSideView_bfs(root));
    }
}
