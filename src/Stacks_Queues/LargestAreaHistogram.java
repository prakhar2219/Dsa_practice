package Stacks_Queues;

import java.util.Stack;

public class LargestAreaHistogram {
    static void greatestArea(int[] area) {
        int maxArea = 0;
        int[] nextSmallerRight = new int[area.length];
        int[] nextSmallerLeft = new int[area.length];

//        next smaller right
        Stack<Integer> stack = new Stack<>();
        for (int i = area.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && area[stack.peek()] >= area[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nextSmallerRight[i] = area.length;
            } else {
                nextSmallerRight[i] = stack.peek();
            }
            stack.push(i);
        }
//        next smaller left
        stack.clear();
        for (int i = 0; i < area.length; i++) {
            while (!stack.isEmpty() && area[stack.peek()] >= area[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nextSmallerLeft[i] = -1;
            } else {
                nextSmallerLeft[i] = stack.peek();
            }
            stack.push(i);
        }
//        area
        for (int i = 0; i < area.length; i++) {
            int height = area[i];
            int width = nextSmallerRight[i] - nextSmallerLeft[i] - 1;
            int currentArea = height * width;
            maxArea = Math.max(currentArea, maxArea);
        }
        System.out.println(maxArea);
    }

    public static void main(String[] args) {
        int[] area = {2, 1, 5, 6, 2, 3};
        greatestArea(area);
    }
}
