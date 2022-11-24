package com.github.leetcode.singal_stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.24
 */
public class A503下一个更大元素II {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[nums.length];
        Arrays.fill(res, -1);
        for (int i = 0; i < nums.length * 2; i++) {
            int cur = nums[i%nums.length];
            while (!stack.isEmpty() && nums[stack.peek()] < cur) {
               int p = stack.pop();
               res[p] = cur;
            }
//            res[i%nums.length] = stack.isEmpty() ? -1 : stack.peek() == i ? -1 : nums[stack.peek()];
            stack.push(i%nums.length);
        }
//        for (int i = nums.length-1; i >= 0; i--) {
//            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
//                Integer pop = stack.pop();
//                res[pop] = nums.length - i + pop;
//            }
//            res[i] = stack.isEmpty() ? -1 : i - stack.peek();
//            stack.push(i);
//        }
        return res;
    }

    public static void main(String[] args) {
        new A503下一个更大元素II().nextGreaterElements(new int[]{5,4,3,2,1});
    }
}
