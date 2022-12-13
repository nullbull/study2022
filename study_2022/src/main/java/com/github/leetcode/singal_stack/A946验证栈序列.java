package com.github.leetcode.singal_stack;

import java.util.Stack;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.12
 */
public class A946验证栈序列 {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int pos = 0;
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[pos]) {
                stack.pop();
                pos++;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        new A946验证栈序列().validateStackSequences(new int[]{1,2,3,4,5}, new int[]{4, 5, 3, 2, 1});
    }
}
