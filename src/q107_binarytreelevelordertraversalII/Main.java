package q107_binarytreelevelordertraversalII;

import punksterutils.*;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static List<List<Integer>> levelOrderBottom(TreeNode root){
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        levelMaker(result,root,0);
        return result;
    }

    public static void levelMaker(List<List<Integer>> list, TreeNode root, int level){
        if (root == null){
            return;
        }
        if (level >= list.size()){
            list.add(0,new LinkedList<Integer>());
        }
        levelMaker(list,root.left,level+1);
        levelMaker(list,root.right,level+1);
        list.get(list.size()-level-1).add(root.value);
    }


    public static void main(String[] args){
        TreeNode a = new TreeNode(3);
        a.left = new TreeNode(9);
        a.right = new TreeNode(20);
        a.right.left = new TreeNode(15);
        a.right.right = new TreeNode(7);
        List<List<Integer>> l = levelOrderBottom(a);
        for (int i = 0; i<l.size(); i++){
            for (int j = 0; j< l.get(i).size();j++){
                System.out.print(l.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
