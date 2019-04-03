package levelOrderPrinting_UsingDFS_recurssion;

import punksterUtils_new.TreeNode;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class LevelOrder_BFS_Recurssion {
    public static void supportFun_recurssion(Queue<TreeNode> queue){
        if (queue.isEmpty()) return;
        TreeNode tmp = queue.remove();
        System.out.println(tmp.value);
        if (tmp.left != null) queue.add(tmp.left);
        if (tmp.right != null) queue.add(tmp.right);
        supportFun_recurssion(queue );
    }

    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static void supportFun_recurssion1(Queue<SupportClass> queue){
        if (queue.isEmpty()) return;
        SupportClass tmp = queue.remove();
        if (list.size() > tmp.level){
            list.get(tmp.level).add(tmp.node.value);
        }
        else {
            list.add(new ArrayList<>());
            list.get(tmp.level).add(tmp.node.value);
        }
        if (tmp.node.left != null) queue.add(new SupportClass(tmp.node.left,tmp.level+1));
        if (tmp.node.right != null) queue.add(new SupportClass(tmp.node.right,tmp.level+1));
        supportFun_recurssion1(queue);
    }

    public static void levelOrderBFS_recurssion(TreeNode root){
        Queue<SupportClass> queue = new LinkedBlockingQueue<>();
        queue.add(new SupportClass(root,0));
        supportFun_recurssion1(queue);
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
        levelOrderBFS_recurssion(root);
    }
}
