package com.company.leetCode;

import java.util.Stack;

public class JZ31 {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int flag = 0;
        for(int i : pushed){
            stack.push(i);
            while(!stack.isEmpty() && popped[flag] == stack.peek()){
                stack.pop();
                flag++;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        validateStackSequences(new int[]{0,1}, new int[]{1,0});
    }
}
