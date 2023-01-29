package com.github.leetcode.dp;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.28
 */
public class A309最佳买卖股票时机含冷冻期 {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][3];
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][2]);
            dp[i][1] = Math.max(dp[i-1][0] - prices[i], dp[i-1][1]);
            dp[i][2] = dp[i][1] + prices[i];
        }
        return Math.max(dp[prices.length-1][0], dp[prices.length-1][2]);
    }
}
