package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class Inorder {
    ArrayList<Integer> list=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root==null){
            return list;
        }

        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;

    }

}
