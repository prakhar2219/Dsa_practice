package BinaryTrees;

public class ChildrenSum {
    public void convertTree(TreeNode root) {
        if (root == null) return;

        // Step 1: Top-down adjustment
        int childSum = 0;
        if (root.left != null) childSum += root.left.val;
        if (root.right != null) childSum += root.right.val;

        if (childSum >= root.val) {
            root.val = childSum;
        } else {
            if (root.left != null) root.left.val = root.val;
            if (root.right != null) root.right.val = root.val;
        }

        // Step 2: Recurse on children
        convertTree(root.left);
        convertTree(root.right);

        // Step 3: Bottom-up adjustment
        int total = 0;
        if (root.left != null) total += root.left.val;
        if (root.right != null) total += root.right.val;

        if (root.left != null || root.right != null) {
            root.val = total;
        }
    }
}
