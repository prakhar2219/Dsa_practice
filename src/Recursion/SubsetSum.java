package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum {
    static void printArraySubsets(int []processed, List<Integer> unprocessed, int index,int sum){
        if (index==processed.length){
//            int sum =0;
//            for (int i = 0; i < unprocessed.size(); i++) {
//                sum+=unprocessed.get(i);
//
//            }
            System.out.print(" "+sum);
            return;
        }
        unprocessed.add(processed[index]);
        printArraySubsets(processed,unprocessed,index+1,sum+processed[index]);
        unprocessed.remove(unprocessed.size()-1);
        printArraySubsets(processed,unprocessed,index+1,sum);
    }

    public static void main(String[] args) {
        int[] arr={5,2,1};
        ArrayList<Integer> unprocesed=new ArrayList<>();
        printArraySubsets(arr,unprocesed,0,0);
    }
}
