package BinaryTrees;

import java.util.ArrayList;
import java.util.Stack;

public class IterativePostOrder {
    public ArrayList<Integer> postorder(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;

        Stack<TreeNode> first = new Stack<>();
        Stack<TreeNode> second = new Stack<>();
        first.push(root);
        while (!first.isEmpty()) {
            TreeNode temp=first.pop();
            second.push(temp);
            if (temp.left != null) {
                first.push(temp.left);
            }
            if (temp.right != null) {
                first.push(temp.right);
            }
        }
        while (!second.isEmpty()){
            list.add(second.pop().val);
        }
        return list;
    }
}
