package BST;

import BinaryTrees.TreeNode;

public class Deletion {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root.val == key) {
if (root.left==null && root.right==null){
    
}
        } else if (root.val > key) {
            deleteNode(root.left, key);
        } else {
            deleteNode(root.right, key);
        }
    }

}
