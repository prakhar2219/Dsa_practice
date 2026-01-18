package Stacks_Queues;

import java.util.Stack;

public class PushBottom {
    public static void pushBottom(Stack<Integer> stack,int value){
        if (stack.isEmpty()){
            stack.push(value);
            return;
        }
        int temp=stack.pop();
        pushBottom(stack,value);
        stack.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        pushBottom(stack,4);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
