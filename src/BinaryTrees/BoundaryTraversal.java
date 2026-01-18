package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversal {
    List<Integer> list = new ArrayList<>();

    public List<Integer> boundaryTraversal(TreeNode root) {
        if (root == null) return list;

        if (!isLeaf(root)) list.add(root.val); // add root if not leaf

        lestTraverse(root.left);     // left boundary
        bottomTraverse(root);        // leaf nodes
        rightTraverse(root.right);   // right boundary (bottom-up)

        return list;
    }

    // Left boundary
    public void lestTraverse(TreeNode root) {
        if (root == null || isLeaf(root)) return;

        list.add(root.val);
        if (root.left != null) lestTraverse(root.left);
        else lestTraverse(root.right);
    }

    // Leaves
    public void bottomTraverse(TreeNode root) {
        if (root == null) return;

        if (isLeaf(root)) {
            list.add(root.val);
            return;
        }
        bottomTraverse(root.left);
        bottomTraverse(root.right);
    }

    // Right boundary (collected bottom-up)
    public void rightTraverse(TreeNode root) {
        if (root == null || isLeaf(root)) return;

        if (root.right != null) rightTraverse(root.right);
        else rightTraverse(root.left);

        list.add(root.val); // add after recursion → ensures bottom-up
    }

    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
