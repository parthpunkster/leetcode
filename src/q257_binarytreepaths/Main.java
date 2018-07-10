package q257_binarytreepaths;

import punksterutils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static List<String> binaryTreePaths(TreeNode root){
        if (root == null){
            return new ArrayList<String>();
        }

        List<String> left = binaryTreePaths(root.left);
        List<String> right = binaryTreePaths(root.right);
        List<String> newList = new ArrayList<String>(left);
        newList.addAll(right);
        List<String> lst = newList.stream().map(str -> new StringBuffer(Integer.toString(root.value)).append("->").append(str).toString()).collect(Collectors.toList());
        if (lst.isEmpty()) {
            lst.add(new StringBuffer(Integer.toString(root.value)).toString());
        }
        return lst;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        List<String> tmp = binaryTreePaths(root);
        for (String s: tmp) System.out.println(s);
    }
}
