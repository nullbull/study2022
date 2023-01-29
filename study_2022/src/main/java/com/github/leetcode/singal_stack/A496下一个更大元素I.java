package com.github.leetcode.singal_stack;

import java.util.HashMap;
import java.util.Stack;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.24
 */
public class A496下一个更大元素I {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums2[stack.peek()] < nums2[i]) {
                stack.pop();
            }
            map.put(nums2[i], stack.isEmpty() ? -1 : nums2[stack.peek()]);
            stack.push(i);
        }
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}
