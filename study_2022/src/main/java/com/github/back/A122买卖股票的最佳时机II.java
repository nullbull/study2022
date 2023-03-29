package com.github.back;

/**
 * @author niuzhenhao
 * @date 2023/3/28 23:07
 * @desc
 */
public class A122买卖股票的最佳时机II {

    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(prices[i] + dp[i-1][1], dp[i-1][0]);
            dp[i][1] = Math.max(dp[i-1][0]-prices[i], dp[i-1][1]);
        }
        return dp[prices.length-1][0];
    }

}
