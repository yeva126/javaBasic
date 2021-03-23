package com.company.leetCode;

import java.util.Stack;

public class JZ9 {
    static class CQUEUE{
        private Stack<Integer> stack1;
        private Stack<Integer> stack2;

        public CQUEUE() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void appendTail(int value) {
            stack1.push(value);
        }

        public int deleteHead() {
            if(stack1.isEmpty()){
                return -1;
            }
            int temp = 0;
            while(!stack1.isEmpty()){
                temp = stack1.pop();
                stack2.push(temp);
            }
            return stack2.pop();
        }
    }

    public static void main(String[] args) {
        CQUEUE cqueue = new CQUEUE();
        cqueue.appendTail(5);
        cqueue.appendTail(2);
        System.out.println(cqueue.deleteHead());
    }
}
