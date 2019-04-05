package t1_q257_binarytreepaths;

import punksterUtils_new.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class T1_BinaryTreePaths {
    public static List<String> generatePaths(TreeNode root,String path){
        if (root.left == null && root.right == null){
            path = path + Integer.toString(root.value);
            List<String> tmp = new ArrayList<>();
            tmp.add(path);
            return tmp;
        }
        path = path + Integer.toString(root.value)+"->";
        List<String> pathFromLeft = new ArrayList<>();
        List<String> pathFromRight = new ArrayList<>();
        if (root.left != null) pathFromLeft = generatePaths(root.left,path);
        if (root.right != null) pathFromRight = generatePaths(root.right,path);
        pathFromLeft.addAll(pathFromRight);
        return pathFromLeft;
    }

    public static List<String> binaryTreePaths(TreeNode root){
        return generatePaths(root,"");
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        System.out.println(binaryTreePaths(root));

    }
}
