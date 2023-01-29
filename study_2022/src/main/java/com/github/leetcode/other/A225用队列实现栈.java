package com.github.leetcode.other;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import sun.plugin.javascript.navig4.Link;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.27
 */
public class A225用队列实现栈 {
    static class MyStack {

        private LinkedList<Integer> a;
        private LinkedList<Integer> b;

        public MyStack() {
            a = new LinkedList<>();
            b = new LinkedList<>();
        }
        public void push(int x) {
            a.offer(x);
            while (!b.isEmpty()) {
                a.offer(b.pollFirst());
            }
            LinkedList temp = a;
            a = b;
            b = temp;
        }

        public int pop() {
            return b.poll();
        }

        public int top() {
            return b.peek();
        }

        public boolean empty() {
            return b.isEmpty();
        }
    }
}
