package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class FindPath {
    List<Integer> list = new ArrayList<>();

    public List<Integer> path(TreeNode root, int target) {
        if (root == null) return list;
        findPath(root, target);
        return list;
    }

    private boolean findPath(TreeNode root, int target) {
        if (root == null) return false;

        // add current node
        list.add(root.val);

        // if target found
        if (root.val == target) return true;

        // recursively check left and right
        if (findPath(root.left, target) || findPath(root.right, target)) {
            return true;
        }

        // if not found in either subtree → backtrack
        list.remove(list.size() - 1);
        return false;
    }
}
