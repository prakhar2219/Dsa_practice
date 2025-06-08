package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativePreorder {
    ArrayList<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current=root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            list.add(current.val);

            current = current.right;
        }

        return list;
    }
}
