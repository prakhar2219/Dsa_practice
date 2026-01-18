package BST;

import BinaryTrees.TreeNode;

public class CeilBST {
    int findCeil(Node root, int key) {
        int ceil = -1;

        while (root != null) {
            if (root.data == key) {
                return root.data;
            } else if (root.data < key) {
                root = root.right;
            } else {
                ceil = root.data;
                root = root.left;
            }


        }
        return ceil;
}
}
