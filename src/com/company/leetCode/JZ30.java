package com.company.leetCode;

import java.util.Stack;

public class JZ30 {
    static class MinStack {

        private Stack<Integer> stack1;
        private Stack<Integer> stack2;

        /** initialize your data structure here. */
        public MinStack() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void push(int x) {
            stack1.push(x);
        }

        public void pop() {
            stack1.pop();
        }

        public int top() {
            return stack1.peek();
        }

        public int min() {
            int temp = 0;
            int min = Integer.MAX_VALUE;
            while(!stack1.isEmpty()){
                temp = stack1.pop();
                min = Math.min(temp, min);
                stack2.push(temp);
            }
            while(!stack2.isEmpty()){
                temp = stack2.pop();
                stack1.push(temp);
            }
            return min;
        }
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.min();
        minStack.pop();
        minStack.top();
        minStack.min();
    }
}
