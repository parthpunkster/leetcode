package levelOrderPrinting_UsingDFS_recurssion;

import punksterUtils_new.TreeNode;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class LevelOrder_BFS_Iterrative {
    public static void levelOrderBFS_iterrrative(TreeNode root){
        Queue<SupportClass> queue = new LinkedBlockingQueue<>();
        queue.add(new SupportClass(root,0));
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        while (!queue.isEmpty()){
            SupportClass tmp = queue.remove();
            if (list.size() > tmp.level){
                list.get(tmp.level).add(tmp.node.value);
            }
            else {
                list.add(new ArrayList<>());
                list.get(tmp.level).add(tmp.node.value);
            }
            if (tmp.node.left != null) queue.add(new SupportClass(tmp.node.left,tmp.level+1));
            if (tmp.node.right != null)queue.add(new SupportClass(tmp.node.right,tmp.level+1));
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
        levelOrderBFS_iterrrative(root);
    }
}
