package Recursion;

import java.util.Stack;

public class SortStack {
    public static void insertInStack(Stack<Integer> s,int x){
        if (s.isEmpty()||x>s.peek()){
            s.push(x);
            return;
        }
        int temp=s.pop();
        insertInStack(s,x);
        s.push(temp);
    }
    public static void sort(Stack<Integer> stack){
        if (!stack.isEmpty()) {
            int x = stack.pop();
            sort(stack);
            insertInStack(stack, x);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(11);
        st.push(2);
        st.push(32);
        st.push(45);
        st.push(3);
        sort(st);
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
        System.out.println();
    }
}
