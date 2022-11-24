package com.github.leetcode.singal_stack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.23
 */
public class A239滑动窗口最大值 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k >= nums.length) {
            return new int[]{Arrays.stream(nums).max().getAsInt()};
        }
        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            if (!stack.isEmpty() && nums[stack.peekLast()] < nums[i]) {
                while (!stack.isEmpty()) {
                    stack.pollFirst();
                }
            }
            stack.push(i);
        }

        int[] res = new int[nums.length-k+1];
        int pos = 0;
        res[pos++] = nums[stack.peekLast()];
        for (int i = k; i <nums.length; i++) {
            while (!stack.isEmpty() && i - stack.peekLast() >= k) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                if (nums[stack.peekLast()] < nums[i]) {
                    while (!stack.isEmpty()) {
                        stack.pop();
                    }
                }
            }
            stack.push(i);
            res[pos++] = nums[stack.peekLast()];
        }
        return res;
    }
//    public int[] maxSlidingWindow(int[] nums, int k) {
//
//    }

    public static void main(String[] args) {
//        new A239滑动窗口最大值().maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3);
        new A239滑动窗口最大值().maxSlidingWindow(new int[]{1,-1}, 1);
    }
}
