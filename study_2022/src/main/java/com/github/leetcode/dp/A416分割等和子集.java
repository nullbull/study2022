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
        if (total % 2 == 1) return false;
        total = total / 2;
        boolean[][] dp = new boolean[nums.length][total+1];
        dp[0][nums[0]] = true;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j <= total; j++) {
                dp[i][j] = dp[i-1][j];

                if (nums[i] == j) {
                    dp[i][j] = true;
                    continue;
                }
                if (j >= nums[i]) {
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i]];
                }
            }
        }
        return dp[nums.length-1][total];
    }

    public static void main(String[] args) {
        new A416分割等和子集().canPartition(new int[]{1, 5, 5, 11});
    }
}
