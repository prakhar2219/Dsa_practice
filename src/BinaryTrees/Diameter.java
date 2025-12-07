package BinaryTrees;

public class Diameter {
    public int calcDiameter(TreeNode root) {
        if (root == null) return 0;

        int leftDiameter = calcDiameter(root.left);
        int rightDiameter = calcDiameter(root.right);

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int throughRoot = leftHeight + rightHeight + 1;

        return Math.max(throughRoot, Math.max(leftDiameter, rightDiameter));
    }

    private int height(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }
}
