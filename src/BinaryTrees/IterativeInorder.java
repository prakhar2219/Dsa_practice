package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeInorder {
    ArrayList<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.peek();
            if (temp.left == null) {
                list.add(stack.pop().val);
            }
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }


        }
        return list;
    }
}
