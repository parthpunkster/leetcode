package t1_q107_binarytreelevelordertraversalII;

import java.util.List;
import punksterUtils_new.TreeNode;
import java.util.LinkedList;

public class T1_BinaryTreeLevelOrderTraversalII {
    public static void levelMaker(TreeNode root, int level, List<List<Integer>> result){
        if (root == null) return;
        if (level >= result.size()){
            result.add(0,new LinkedList<Integer>());
        }
        levelMaker(root.left,level+1,result);
        levelMaker(root.right,level+1,result);
        result.get(result.size()-level-1).add(root.value);
    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root){
        List<List<Integer>> result = new LinkedList<>();
        levelMaker(root,0,result);
        return result;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        TreeNode a = new TreeNode(9);
        TreeNode b = new TreeNode(20);
        TreeNode c = new TreeNode(15);
        TreeNode d = new TreeNode(7);
        root.left = a;
        root.right = b;
        b.left=c;
        b.right = d;
        System.out.println(levelOrderBottom(root));

    }
}
