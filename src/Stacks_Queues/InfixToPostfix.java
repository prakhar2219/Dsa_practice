package Stacks_Queues;

import java.util.Stack;

public class InfixToPostfix {
    public static void conversion(String infix) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            if (Character.isLetter(ch)) {
                System.out.print(ch);
            }
            if (ch == '(') {
                stack.push(ch);
            }
            if (ch == ')') {
                while (!stack.isEmpty()&&stack.peek() != '(') {
                    System.out.print(stack.pop());
                }
                if (!stack.isEmpty()&& stack.peek() == '(') {
                    stack.pop();
                }
            }
            if (isOperator(ch)) {
                if (stack.isEmpty() || stack.peek() == '(' || precedance(ch) > precedance(stack.peek())) {
                    stack.push(ch);
                } else {
                    while (!stack.isEmpty() && stack.peek() != '(' &&
                            (precedance(ch) < precedance(stack.peek()) ||
                                    (precedance(ch) == precedance(stack.peek()) && !isRightAssociative(ch)))) {
                        System.out.print(stack.pop());
                    }
                    stack.push(ch);
                }
            }
        }
        while (!stack.isEmpty()) System.out.print(stack.pop());
    }
    static boolean isRightAssociative(char ch) {
        return ch == '^';
    }

    static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }

    static int precedance(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    public static void main(String[] args) {
        conversion("a+b*(c^d-e)^(f+g*h)-i");
    }
}
