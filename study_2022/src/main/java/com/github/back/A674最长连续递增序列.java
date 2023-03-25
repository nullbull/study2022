package com.github.back;

import java.util.Arrays;

/**
 * @author niuzhenhao
 * @date 2023/3/25 12:10
 * @desc
 */
public class A674最长连续递增序列 {
    public int findLengthOfLCIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                dp[i] = dp[i-1] + 1;
                res = Math.max(dp[i], res);
            }
        }
        return res;
    }
}
