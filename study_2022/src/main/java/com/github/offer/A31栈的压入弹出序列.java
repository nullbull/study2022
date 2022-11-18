package com.github.offer;

import java.util.Stack;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.17
 */
public class A31栈的压入弹出序列 {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int pop = 0;
        int push = 0;
        while (push < pushed.length) {
            if (stack.isEmpty() || stack.peek() != popped[pop]) {
                stack.push(pushed[push++]);
            } else {
                stack.pop();
                pop++;
            }
        }
        for (int i = pop; i < popped.length; i++) {
            if (!stack.isEmpty() && popped[i] == stack.peek()) {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        new A31栈的压入弹出序列().validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 2, 3, 1});
    }
}
