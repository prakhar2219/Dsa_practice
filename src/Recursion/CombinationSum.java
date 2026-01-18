package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    static void printCombinationSum(int []processed, List<Integer> unprocessed, int index, int target,int sum){
        if (sum==target){
            System.out.println(unprocessed);
            return;
        }
        if(sum>target||index>=processed.length){return;}

        unprocessed.add(processed[index]);
        printCombinationSum(processed,unprocessed,index,target, sum+processed[index]);
        unprocessed.remove(unprocessed.size()-1);
        printCombinationSum(processed,unprocessed,index+1,target,sum);
    }

    public static void main(String[] args) {
        int[] processed={1,2,3};
        ArrayList<Integer> unprocessed=new ArrayList<>();
        printCombinationSum(processed,unprocessed,0,3,0);
    }
}
