package com.github.leetcode.dp;

import java.util.Arrays;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.14
 */
public class A494目标和 {


    public int findTargetSumWays(int[] nums, int target) {
        int total = Arrays.stream(nums).sum() - target;
        if (total < 0 || target % 2 != 0 ) {
            return 0;
        }
        target = total / 2;
        int[][]dp = new int[nums.length+1][target+1];
        dp[0][0] = 1;
        for (int i = 1; i <= nums.length; i++) {
            int v = nums[i-1];
            for (int j = 0; j <= target; j++) {
                if (j < v) {
                    dp[i][j] = dp[i-1][j];
                } else  {
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-v];
                }
            }
        }
        return dp[nums.length][target];
    }

}
