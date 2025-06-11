package BinaryTrees;

public class Height {
    public int maxDepth(TreeNode root) {
if (root==null){return 1;}
int leftHeight=maxDepth(root.left);
int rightHeight=maxDepth(root.right);
return Math.max(leftHeight,rightHeight)+1;
    }
}
