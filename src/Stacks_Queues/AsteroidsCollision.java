package Stacks_Queues;

import java.util.ArrayList;
import java.util.Stack;

public class AsteroidsCollision {
    static Stack<Integer> stack=new Stack<>();
    static void calculateCollision(int[] input){
        for (int i = input.length-1; i >=0; i--) {
            int element=input[i];
            if (stack.isEmpty()){
                stack.push(element);
            }else{
               int stackTop =stack.peek();
               if (collision(element,stackTop)!=0){
              stack.push(collision(element,stackTop));}
            }
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    private static int collision(int element, int stackTop) {
        if ((element < 0 && stackTop < 0)||(element>0 && stackTop >0)) {
            return element;
        }
        if (element < 0 && stackTop > 0) {
            if (Math.abs(element) > stackTop) {
                stack.pop();
                return element;
            }
        }
        if (element > 0 && stackTop < 0) {
            if (element > Math.abs(stackTop)) {
                stack.pop();
                return element;
            }
        }
    return 0;
    }

    public static void main(String[] args) {
        int[] array={10,2,-5};
        calculateCollision(array);
    }
}
