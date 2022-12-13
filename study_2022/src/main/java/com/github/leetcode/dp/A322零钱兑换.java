package com.github.leetcode.dp;

import java.util.Arrays;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.12
 */
public class A322零钱兑换 {

    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length + 1][amount + 1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], amount + 1);
            if (i > 0) {
                dp[i][0] = 0;
            }
        }
        for (int i = 1; i <= coins.length; i++) {
            int v = coins[i - 1];
            for (int j = 1; j <= amount; j++) {
                if (j < v) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - v] + 1);
                }
            }
        }
        return dp[coins.length][amount] == amount + 1 ? -1 : dp[coins.length][amount];
    }

    public static void main(String[] args) {
        new A322零钱兑换().coinChange(new int[]{1, 2, 5}, 11);
    }
}
