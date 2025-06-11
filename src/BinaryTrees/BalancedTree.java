package BinaryTrees;

public class BalancedTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        boolean currentBalanced = Math.abs(leftHeight - rightHeight) <= 1;

        return (currentBalanced && isBalanced(root.left) && isBalanced(root.right));
    }
    public int maxDepth(TreeNode root) {
        if (root==null){return 0;}
        int leftHeight=maxDepth(root.left);
        int rightHeight=maxDepth(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
}
