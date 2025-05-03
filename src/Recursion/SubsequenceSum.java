package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SubsequenceSum {
   static void printArraySubsets(int []processed, List<Integer>unprocessed, int index,int target){
       if (index==processed.length){
           int sum =0;
           for (int i = 0; i < unprocessed.size(); i++) {
               sum+=unprocessed.get(i);

           }
           if (sum==target){
               System.out.println(unprocessed);

           }
           return;
       }
       int element=processed[index];
       unprocessed.add(processed[index]);
       printArraySubsets(processed,unprocessed,index+1,target);
       unprocessed.remove(unprocessed.size()-1);
       printArraySubsets(processed,unprocessed,index+1,target);
   }

    public static void main(String[] args) {
        int[] arr={1,2,3};
        ArrayList<Integer> unprocesed=new ArrayList<>();
        printArraySubsets(arr,unprocesed,0,3);
    }
}
