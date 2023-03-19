package com.github.leetcode.tree;

import java.util.Stack;

public class A150逆波兰表达式求值 {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String val : tokens) {
            if (val.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (val.equals("-")) {
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2 - temp1);
            } else if (val.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (val.equals("/")) {
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2 / temp1);
            } else {
                stack.push(Integer.valueOf(val));
            }
        }
        return stack.pop();
    }
}
