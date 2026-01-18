package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    static void printCombinationSum(int []processed, List<Integer> unprocessed, int index, int target, int sum,int length){

        if (sum==target&&unprocessed.size()==length){
            System.out.println(unprocessed);
            return;
        }
        if(sum>target||index>=processed.length){return;}

        unprocessed.add(processed[index]);
        printCombinationSum(processed,unprocessed,index+1,target, sum+processed[index],length);
        unprocessed.remove(unprocessed.size()-1);
        printCombinationSum(processed,unprocessed,index+1,target,sum,length);
    }

    public static void main(String[] args) {
        int[] processed={1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> unprocessed=new ArrayList<>();
        printCombinationSum(processed,unprocessed,0,7,0,3);
    }
}
