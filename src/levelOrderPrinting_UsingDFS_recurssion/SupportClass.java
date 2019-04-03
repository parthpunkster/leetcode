package levelOrderPrinting_UsingDFS_recurssion;

import punksterUtils_new.TreeNode;

public class SupportClass {
    TreeNode node;
    int level;

    public SupportClass(TreeNode node, int level){
        this.node = node;
        this.level = level;
    }
}
