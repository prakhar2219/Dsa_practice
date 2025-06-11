package BST;

import BinaryTrees.TreeNode;

public class isValidBst {
    boolean isValid=false;
    public boolean isValidBST(TreeNode root) {
        helper(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
return isValid;
    }
    private void helper(TreeNode root, int minValue, int maxValue) {
            if (root==null){return;}
            isValid= (root.left.val<root.val) && (root.right.val>root.val) && (isValidBST(root.left)) && (isValidBST(root.right));
        }
    }

