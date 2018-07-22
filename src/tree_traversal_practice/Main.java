package tree_traversal_practice;

import punksterutils.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void printGivenLevelOfTree(TreeNode root, int level){
        if (root == null) return;
        if (level == 1) System.out.println(root.value);
        else if (level > 1){
            printGivenLevelOfTree(root.left,level-1);
            printGivenLevelOfTree(root.right,level-1);
        }
    }

    public static int heightOfBinaryTree(TreeNode root){
        if (root == null) return 1;
        return Math.max(heightOfBinaryTree(root.left)+1,heightOfBinaryTree(root.right)+1);
    }

    public static void bfs_recurssion(TreeNode root){
        int height = heightOfBinaryTree(root);
        for (int i = 1; i<= height; i++){
            printGivenLevelOfTree(root,i);
        }
    }

    public static void bfs_without_recurssion(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            System.out.println(tmp.value);
            if (tmp.left != null){
                queue.add(tmp.left);
            }
            if (tmp.right != null) {
                queue.add(tmp.right);
            }
        }
    }

    public static void visit(TreeNode root){
        System.out.println(root.value);
    }

    public static void preOrderTraversal_dfs(TreeNode root){
        if (root != null){
            visit(root);
            preOrderTraversal_dfs(root.left);
            preOrderTraversal_dfs(root.right);
        }
    }

    public static void postOrderTraversal_dfs(TreeNode root){
        if (root != null){
            postOrderTraversal_dfs(root.left);
            postOrderTraversal_dfs(root.right);
            visit(root);
        }
    }

    public static void inOrderTraversal_dfs(TreeNode root){
        if (root!=null){
            inOrderTraversal_dfs(root.left);
            visit(root);
            inOrderTraversal_dfs(root.right);
        }
    }

    public static TreeNode generateBinaryTreeFromArray(int[] array){
        if (array.length == 0) return null;
        int mid = array.length / 2;
        TreeNode root = new TreeNode(array[mid]);
        root.left = generateBinaryTreeFromArray(Arrays.copyOfRange(array,0,mid));
        root.right = generateBinaryTreeFromArray(Arrays.copyOfRange(array,mid+1,array.length));
        return root;
    }

    public static void main(String[] args){
        TreeNode root = generateBinaryTreeFromArray(new int[]{1,2,3,4,5,6,7,8,9,10});
//        bfs_recurssion(root);
//        System.out.println("--------------");
//        bfs_without_recurssion(root);
    }
}
