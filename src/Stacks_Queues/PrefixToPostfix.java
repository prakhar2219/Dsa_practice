package Stacks_Queues;

import java.util.Stack;

public class PrefixToPostfix {
    public static void conversion3(String prefix) {
        Stack<String> stack=new Stack<>();
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);
            if (Character.isLetter(ch)) {
                stack.push(String.valueOf(ch));
            }
            if (isOperator(ch)){
                String s=stack.pop() +stack.pop() +ch;
                stack.push(s);
            }

        }
        System.out.println(stack.pop());
    }
    static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }
    public static void main(String[] args) {
        conversion3("*-A/BC-/AKL");
    }
}
