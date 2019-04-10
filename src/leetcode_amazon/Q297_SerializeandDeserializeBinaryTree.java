package leetcode_amazon;

import punksterUtils_new.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Q297_SerializeandDeserializeBinaryTree {
    public static String serialize(TreeNode root){
        if (root == null) return "null,";
        String res =Integer.toString(root.value)+",";
        res = res+serialize(root.left);
        res = res+serialize(root.right);
        return res;
    }

    public static TreeNode supportFun(List<String> str){
        if (str.get(0).equals("null")){
            str.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(str.get(0)));
        str.remove(0);
        root.left = supportFun(str);
        root.right = supportFun(str);
        return root;
    }

    public static TreeNode deserialize(String data){
        String[] str = data.split(",");
        List<String> strList = new ArrayList<>(Arrays.asList(str));
        return supportFun(strList);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        String serialized = serialize(root);
        System.out.println(serialized);
        deserialize(serialized);
    }
}
