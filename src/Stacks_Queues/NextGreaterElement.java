package Stacks_Queues;

import java.lang.reflect.Array;

public class NextGreaterElement {
    public static Array findGreater(int[] input){
        int [] nextGreater=new int[input.length];
        int index=0,i=0;
        do {

            if (i==input.length){
                i=i%input.length;
            }
            i++;
        }while (i!=index);
    }
}
