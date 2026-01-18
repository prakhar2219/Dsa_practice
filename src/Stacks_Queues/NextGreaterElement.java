package Stacks_Queues;

import java.lang.reflect.Array;
import java.util.Stack;

public class NextGreaterElement {
    public static void findGreater(int[] input,int[] nextGreater){
        Stack<Integer> stack=new Stack<>();
        for (int i = input.length-1; i >=0; i--) {
            while (!stack.isEmpty() && stack.peek()<=input[i]){
                stack.pop();
            }
            if (stack.isEmpty()){
                nextGreater[i]=-1;
            }else{
                nextGreater[i]=stack.peek();
            }
            stack.push(input[i]);
        }
    }

    public static void main(String[] args) {
        int [] input={6,8,0,1,3};
        int [] nextGreater=new int[input.length];
        findGreater(input,nextGreater);
        for (int i = 0; i < nextGreater.length; i++) {
            System.out.println(nextGreater[i]);
        }
    }
}
