package Stacks_Queues;

import java.util.Stack;

public class ReverseString {
    static String reverse(String input){
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        StringBuilder result=new StringBuilder();
        while (!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }
}
