package BinaryTrees;

import java.util.*;


public class ZigZagTraversal {
    List<List<Integer>> fullList=new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return fullList;
        Deque<TreeNode> deque=new LinkedList<>();
        deque.add(root);
        boolean traversal=true;
       while (!deque.isEmpty()){
           int levelSize=deque.size();

           List<Integer> list =new ArrayList<>(levelSize);
           if (traversal == true) {
                for (int i = 0; i < levelSize; i++) {
                    TreeNode temp = deque.pollFirst();
                    list.add(temp.val);
                    if (temp.left != null) {
                        deque.addLast(temp.left);
                    }
                    if (temp.right != null) {
                        deque.addLast(temp.right);
                    }

                }
            } else {
                for (int i = 0; i < levelSize; i++) {
                    TreeNode temp = deque.pollLast();
                    list.add(temp.val);

                    if (temp.right != null) {
                        deque.addFirst(temp.right);
                    }
                    if (temp.left != null) {
                        deque.addFirst(temp.left);
                    }

                }
            }
            traversal = !traversal;
            fullList.add(list);
        }
       return fullList;
    }

}
