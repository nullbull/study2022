package com.github.leetcode.dp;

import java.util.Arrays;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.24
 */
public class A1049最后一块石头的重量II {

    public int lastStoneWeightII(int[] stones) {
        int sum = Arrays.stream(stones).sum();
        int target = sum / 2;
        int[][] dp = new int[stones.length][target + 1];
        for (int i = stones[0]; i <= target; i++) {
            dp[0][i] = stones[0];
        }
        for (int i = 1; i < stones.length; i++) {
            for (int j = 0; j <= target; j++) {
                dp[i][j] = dp[i-1][j];
                if (j >= stones[i]) {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-stones[i]] + stones[i]);
                }
            }
        }
        return sum - dp[stones.length-1][target];
    }

    public static void main(String[] args) {
        new A1049最后一块石头的重量II().lastStoneWeightII(new int[]{1,1,2,7,8});
    }
}
