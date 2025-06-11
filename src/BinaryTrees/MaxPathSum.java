package BinaryTrees;

public class MaxPathSum {
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxSum;
    }
    private int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(0,helper(root.left));
        int right = Math.max(0,helper(root.right));
        int currentSum = left + right + root.val;
        maxSum = Math.max(maxSum, currentSum);
        return (root.val + Math.max(left, right));
    }
}
