package levelOrderPrinting_UsingDFS_recurssion;

import punksterUtils_new.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LevelOrder_DFS_Recurssion {
    static HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
    public static void supportFun_recursion(TreeNode root, int level){
        if (root == null) return;
        if (map.containsKey(level)){
            map.get(level).add(root.value);
        }
        else {
            map.put(level,new ArrayList<Integer>());
            map.get(level).add(root.value);
        }
        supportFun_recursion(root.left,level+1);
        supportFun_recursion(root.right,level+1);
    }

    public static void levelOrderDFS_recusrrion(TreeNode root){
        supportFun_recursion(root,0);
        for (Map.Entry<Integer,ArrayList<Integer>> entry: map.entrySet()){
            int key = entry.getKey();
            ArrayList<Integer> value = entry.getValue();
            System.out.println(value);
        }
    }


    public static void main(String[] args){
        TreeNode root = new TreeNode(4);
        TreeNode a1 = new TreeNode(2);
        TreeNode a2 = new TreeNode(7);
        root.left = a1;
        root.right = a2;
        a1.left = new TreeNode(1);
        a1.right = new TreeNode(3);
        a2.left = new TreeNode(6);
        a2.right = new TreeNode(8);
        levelOrderDFS_recusrrion(root);
    }
}
