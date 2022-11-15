package com.github.leetcode.dp;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.13
 */
public class A121买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int dp[] = new int[prices.length];
        dp[0] = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i] = Math.min(prices[i], dp[i - 1]);
            max = Math.max(prices[i] - dp[i], max);
        }
        return max;
    }
}
