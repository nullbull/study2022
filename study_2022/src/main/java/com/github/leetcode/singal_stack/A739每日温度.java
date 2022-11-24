package com.github.leetcode.singal_stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.23
 */
public class A739每日温度 {

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        for (int i = temperatures.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                stack.push(i);
                list.add(0);
            } else if (temperatures[stack.peek()] <= temperatures[i]) {
                while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    list.add(0);
                } else {
                    list.add(stack.peek() - i);
                }
                stack.push(i);
            } else {
                list.add(stack.peek() - i);
                stack.push(i);
            }
        }
        Collections.reverse(list);
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        new A739每日温度().dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
    }
}
