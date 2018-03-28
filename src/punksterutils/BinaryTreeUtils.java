package punksterutils;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeUtils {

    public static void visit(TreeNode node){
        if (node != null){
            System.out.println(node.value);
        }
    }

    public static int height(TreeNode root){
        if (root == null){
            return 0;
        }
        return Math.max(height(root.left)+1,height(root.right)+1);
    }

    public static int minHeight(TreeNode root){
        if (root == null){
            return 0;
        }
        int x = minHeight(root.left);
        int y = minHeight(root.right);
        return (x == 0 || y == 0) ? x+y+1 : Math.min(x,y)+1;
    }

    public static void printGivenLevel(TreeNode root, int level){
        if (root == null){
            return;
        }
        if (level == 1){
            System.out.println(root.value);
        }
        else if (level > 1){
            printGivenLevel(root.left,level-1);
            printGivenLevel(root.right,level-1);
        }
    }

    public static void bfs(TreeNode root){
        int length = BinaryTreeUtils.height(root);
        for (int i = 1; i<= length; i++){
            printGivenLevel(root,i);
        }
    }

    public static void bfsModfied(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode tempNode = queue.poll();
            System.out.println(tempNode.value);
            if (tempNode.left != null){
                queue.add(tempNode.left);
            }
            if (tempNode.right != null){
                queue.add(tempNode.right);
            }
        }
    }

    public static void dfsInOrderTraversal(TreeNode root){
        if (root == null){
            return;
        }
        dfsInOrderTraversal(root.left);
        visit(root);
        dfsInOrderTraversal(root.right);
    }

    public static void dfsPreOrderTraversal(TreeNode root){
        if (root == null){
            return;
        }
        visit(root);
        dfsPreOrderTraversal(root.left);
        dfsPreOrderTraversal(root.right);
    }

    public static void dfsPostOrderTraversal(TreeNode root){
        if (root == null){
            return;
        }
        dfsPreOrderTraversal(root.left);
        dfsPreOrderTraversal(root.right);
        visit(root);
    }

    public static TreeNode sortedArrayToBST(int[] nums){
        if (nums.length ==0){
            return null;
        }
        int start = 0;
        int end = nums.length-1;
        int mid = (start+end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums,0,mid));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums,mid+1,nums.length));
        return root;
    }
}
