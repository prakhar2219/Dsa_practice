package BST;

import BinaryTrees.TreeNode;

public class MinimumElement {
     int minValue(TreeNode root){
        if (root == null) return -1;
        if (root.left == null) return root.val;
        return minValue(root.left);

    }
}
