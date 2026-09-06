package Stack;

import java.util.*;

class MaxStack {
    private List<Integer> stack;

    public MaxStack() {
        stack = new ArrayList<>();
    }

    public void push(int x) {
        stack.add(x);
    }

    public int pop() {
        return stack.remove(stack.size() - 1);
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public int peekMax() {
        int max = Integer.MIN_VALUE;

        for (int num : stack) {
            max = Math.max(max, num);
        }

        return max;
    }

    public int popMax() {
        int max = peekMax();

        // Remove the top-most occurrence of the maximum value
        for (int i = stack.size() - 1; i >= 0; i--) {
            if (stack.get(i) == max) {
                stack.remove(i);
                break;
            }
        }

        return max;
    }

}

/*
 * LeetCode 716 — Max Stack
 * 
 * Design a stack data structure supporting these operations:
 * 
 * MaxStack(): Initialize the stack.
 * push(int x): Add x to the top.
 * pop(): Remove and return the top element.
 * top(): Return the top element without removing it.
 * peekMax(): Return the largest value currently in the stack.
 * popMax(): Remove and return the largest value. If the largest value appears
 * multiple times, remove the occurrence closest to the top of the stack.
 */