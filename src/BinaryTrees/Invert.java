package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class Invert {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        invertTree(root.left);
        invertTree(root.right);
        root=swap(root);
        return root;
    }
    public TreeNode swap(TreeNode root){
        TreeNode temp=root.right;
        root.right=root.left;
        root.left=temp;
        return root;
    }
//    public TreeNode invertTree(TreeNode root) {
//        if (root == null) return null;
//
//        TreeNode left = invertTree(root.left);
//        TreeNode right = invertTree(root.right);
//
//        root.left = right;
//        root.right = left;
//
//        return root;
//    }

}
