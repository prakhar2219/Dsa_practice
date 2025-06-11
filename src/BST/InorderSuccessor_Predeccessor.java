package BST;

import BinaryTrees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class InorderSuccessor_Predeccessor {
    ArrayList<Integer> list=new ArrayList<>();
    List<Integer> findSucc(TreeNode root,int key){
        helper(root,key);
        return list;
    }

    private int helper(TreeNode root, int key) {
        if (root == null) return -1;

        if (key < root.val) {
            helper(root.left,key);
        }else if(key==root.val){

        }else {
        helper(root.right,key);
        }
    }
}
