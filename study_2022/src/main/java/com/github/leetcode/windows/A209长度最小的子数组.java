package com.github.leetcode.windows;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.23
 */
public class A209长度最小的子数组 {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int sum = 0;
        int len = Integer.MAX_VALUE;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= target) {
                sum -= nums[i++];
                len = Math.min(len, j - i + 1);
            }
        }
        if (len == Integer.MAX_VALUE ) return 0;
        else return len;
    }
}
