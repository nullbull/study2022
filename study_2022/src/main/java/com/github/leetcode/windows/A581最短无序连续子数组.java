package com.github.leetcode.windows;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.14
 */
public class A581最短无序连续子数组 {
    public int findUnsortedSubarray(int[] nums) {
        int l = 0;
        int r = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0 ; i < nums.length; i++) {
            if (nums[i] < max) {
                l = i;
            }
            max = Math.max(max, nums[i]);
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > min) {
                r = i;
            }
            min = Math.min(min, nums[i]);
        }
        if (r == l) {
            return 0;
        }
        return r - l + 1;
    }
}
