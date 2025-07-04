package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversal {
List<Integer> list =new ArrayList<>();
List<Integer> traverse(TreeNode root){
    list.add(root.val);
leftTraversal(root);
rightTraversal(root);
return list;
}

    private void rightTraversal(TreeNode root) {

    }

    void leftTraversal(TreeNode node){
    list.add(node.val);
    leftTraversal(node.left);
    leftTraversal(node.right);
}
}
