package com.github.leetcode.dp;

import java.util.Arrays;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.24
 */
public class A416分割等和子集 {

    public boolean canPartition(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int[][] dp = new int[nums.length][total];
        dp[0][0] = 0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 1; j < total; j++) {
                dp[i][j] = Math.max(dp[])
            }
        }
    }
}
