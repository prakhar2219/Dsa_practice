package Recursion;

import java.util.Stack;

public class ReverseStack {

    public static void insertAtBottom(Stack<Integer> stack, int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            return;
        }
        int num = stack.pop();
        insertAtBottom(stack, x);
        stack.push(num);
    }

    public static void revStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int num = stack.pop();
        revStack(stack);
        insertAtBottom(stack, num);
    }

    public static void printStack(Stack<Integer> st) {
        for (int i = st.size() - 1; i >= 0; i--) {
            System.out.print(st.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(11);
        st.push(2);
        st.push(32);
        st.push(45);
        st.push(3);

        System.out.println("Original Stack:");
        printStack(st);

        revStack(st);

        System.out.println("Reversed Stack:");
        printStack(st);
    }
}
