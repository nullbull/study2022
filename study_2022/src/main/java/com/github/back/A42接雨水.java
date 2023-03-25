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
            while ((!stack.isEmpty() && height[i] > height[stack.peek()])) {
                int idx = stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                res += (Math.min(height[stack.peek()], height[i]) - height[idx]) * (i - stack.peek());
            }
            stack.push(i);
        }
        return res;
    }
}
