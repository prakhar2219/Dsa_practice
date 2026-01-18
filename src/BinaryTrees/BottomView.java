package BinaryTrees;

import java.util.*;

public class BottomView {
    public List<Integer> viewBottom(TreeNode node){
        List<Integer> ans = new ArrayList<Integer>();
        if (node==null){
            return ans;
        }
        int col=0;
        Queue<Map.Entry<TreeNode,Integer>> queue=new ArrayDeque<>();
        Map<Integer,Integer> map=new HashMap<>();
        queue.offer(new AbstractMap.SimpleEntry<>(node,col));
        int min=0;
        int max=0;
        while (!queue.isEmpty()){
            Map.Entry<TreeNode,Integer> current=queue.poll();
            node=current.getKey();
            col=current.getValue();
            if (node!=null){

                    map.put(col,node.val);

                min=Math.min(min,col);
                max=Math.max(max,col);
                if (node.left != null) {
                    queue.offer(new AbstractMap.SimpleEntry<>(node.left, col - 1));
                }
                if (node.right != null) {
                    queue.offer(new AbstractMap.SimpleEntry<>(node.right, col + 1));
                }

            }

        }
        for (int i = min; i <=max ; i++) {
            ans.add(map.get(i));
        }
        return ans;
    }

}
