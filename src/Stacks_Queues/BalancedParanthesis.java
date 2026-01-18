package Stacks_Queues;

import java.util.Stack;

public class BalancedParanthesis {
    public static boolean balanced(String input){
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char ch=input.charAt(i);
            if (ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }
            if (stack.peek()=='('&&ch==')'){
                stack.pop();
            }
            if (stack.peek()=='{'&&ch=='}'){
                stack.pop();
            }
            if (stack.peek()=='['&&ch==']'){
                stack.pop();
            }
        }
        if (stack.isEmpty())return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(balanced("[ ( )]"));
    }
}
