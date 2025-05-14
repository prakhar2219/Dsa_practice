package Stacks_Queues;

import java.util.Stack;

public class PostfixToPrefix {
    public static void conversion4(String postfix) {
        Stack<String> stack=new Stack<>();
        for (int i =0; i <postfix.length(); i++) {
            char ch = postfix.charAt(i);
            if (Character.isLetter(ch)) {
                stack.push(String.valueOf(ch));
            }
            if (isOperator(ch)){
                String right = stack.pop();
                String left = stack.pop();
                String expr = ch + left + right;
                stack.push(expr);
            }

        }
        System.out.println(stack.pop());
    }
    static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }
    public static void main(String[] args) {
        conversion4("AB+CD-*");
    }
}
