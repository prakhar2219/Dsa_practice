package Stacks_Queues;

import java.util.Stack;

public class PrefixToInfix {
    public static void conversion2(String prefix) {
        Stack<String> stack=new Stack<>();
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);
            if (Character.isLetter(ch)) {
                stack.push(String.valueOf(ch));
            }
            if (isOperator(ch)){
                String s="("+stack.pop() + ch + stack.pop()+")";
                stack.push(s);
            }

        }
        System.out.println(stack.pop());
    }
    static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }
    public static void main(String[] args) {
        conversion2("*+AB-CD");
    }
}
