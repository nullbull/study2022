package com.github.back;

import java.util.Stack;

/**
 * @author niuzhenhao
 * @date 2023/3/25 15:52
 * @desc
 */
public class A42接雨水 {

    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[stack.peek()] < height[i]) {
                int idx = stack.pop();
                int high = height[idx];
                if (stack.isEmpty()) {
                    continue;
                }
                res += (Math.min(height[stack.peek()], height[i]) - high) * (i - stack.peek() - 1);
            }
            stack.push(i);
        }
        return res;
    }
}
