package levelOrderPrinting_UsingDFS_recurssion;

import punksterUtils_new.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

public class LevelOrder_DFS_Iterrative {
    public static void levelOrderDFSIterrative(TreeNode root){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Stack<SupportClass> stack = new Stack<>();
        stack.push(new SupportClass(root,0));
        while (!stack.isEmpty()){
            SupportClass tmp = stack.pop();
            if (list.size() > tmp.level){
                list.get(tmp.level).add(tmp.node.value);
            }
            else {
                list.add(new ArrayList<>());
                list.get(tmp.level).add(tmp.node.value);
            }
            if (tmp.node.right != null) stack.push(new SupportClass(tmp.node.right,tmp.level+1));
            if (tmp.node.left != null) stack.push(new SupportClass(tmp.node.left,tmp.level+1));
        }

        for (ArrayList<Integer> l : list){
            System.out.println(l);
        }
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(4);
        TreeNode r1 = new TreeNode(2);
        TreeNode r2 = new TreeNode(7);
        root.left = r1;
        root.right = r2;
        r1.left = new TreeNode(1);
        r1.right = new TreeNode(3);
        r2.left = new TreeNode(6);
        r2.right = new TreeNode(8);
        levelOrderDFSIterrative(root);
    }
}
