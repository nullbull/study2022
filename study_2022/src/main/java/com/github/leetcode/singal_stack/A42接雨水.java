package com.github.leetcode.singal_stack;

import java.util.Stack;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.09
 */
public class A42接雨水 {
    public int trap(int[] height) {
        int current = 0;
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        while (current < height.length) {
            while (!stack.isEmpty() && height[current] > height[stack.peek()]) {
                int h = height[stack.peek()];
                stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                int distinct = current - stack.peek() - 1;
                res += distinct * (Math.min(height[stack.peek()], height[current]) - h);
            }
            stack.push(current);
            current++;
        }
        return res;
    }

    public static void main(String[] args) {
        int ret = new A42接雨水().trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
        System.out.println(ret);
    }
}
