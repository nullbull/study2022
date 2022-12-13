package com.github.leetcode.dp;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.12
 */
public class A518零钱兑换II {

    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length+1][amount+1];
        dp[0][0] = 1;
        for (int i = 1; i <= coins.length; i++) {
            int v = coins[i-1];
            for (int j = 1; j <= amount; j++) {
               if(j < v) {
                   dp[i][j] = dp[i-1][j];
               } else {
                   dp[i][j] = dp[i-1][j] + dp[i][j-v];
               }
            }
        }
        return dp[coins.length][amount];
    }

}
