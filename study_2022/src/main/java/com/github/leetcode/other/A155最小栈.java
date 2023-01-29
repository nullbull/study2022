package com.github.leetcode.other;

import java.util.Stack;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.28
 */
public class A155最小栈 {

    static class MinStack {

        Stack<Integer> data;
        Stack<Integer> help;

        public MinStack() {
            data = new Stack<>();
            help = new Stack<>();
        }

        public void push(int val) {
            data.push(val);
            if (!help.isEmpty()) {
                if (help.peek() < val) {
                    help.push(val);
                } else {
                    help.push(help.peek());
                }
            } else {
                help.push(val);
            }
        }

        public void pop() {
            data.pop();
            help.pop();
        }

        public int top() {
            return data.peek();
        }

        public int getMin() {
            return help.peek();
        }
    }
}
