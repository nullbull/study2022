package com.github.back;

import java.util.Stack;

/**
 * @author niuzhenhao
 * @date 2023/3/26 22:26
 * @desc
 */
public class A232用栈实现队列 {

    class MyQueue {

        private Stack<Integer> a;

        private Stack<Integer> b;
        public MyQueue() {
            a = new Stack<>();
            b = new Stack<>();
        }

        // 1 2
        // 2 1
        // 1 2 3
        public void push(int x) {
            while (!a.isEmpty()) {
                b.push(a.pop());
            }
            b.push(x);
            while (!b.isEmpty()) {
                a.push(b.pop());
            }
        }

        public int pop() {
            if (a.isEmpty()) {
                return -1;
            }
            return a.pop();
        }

        public int peek() {
            if (a.isEmpty()) {
                return -1;
            }
            return a.peek();
        }

        public boolean empty() {
            return a.empty();
        }
    }

}
