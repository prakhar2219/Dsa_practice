package BST;

import BinaryTrees.TreeNode;

public class Kth_Smallest {
    int count=0;
    int result = -1;
    public int kthSmallest(TreeNode root, int k) {
        helper(root,k);
        return result;

    }
    private void helper(TreeNode root, int k) {
        if (root == null) return;
        kthSmallest(root.left, k);
        count++;
        if (count==k){
            result=root.val;
            return;
        }
        kthSmallest(root.right, k);

    }
}
