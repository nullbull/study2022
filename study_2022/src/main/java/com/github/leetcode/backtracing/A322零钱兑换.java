package com.github.leetcode.backtracing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.21
 */
public class A322零钱兑换 {
//    int minLen = Integer.MAX_VALUE;
//    public int coinChange(int[] coins, int amount) {
//        dfs(new ArrayList<>(), coins, amount, 0);
//        if (minLen == Integer.MAX_VALUE) {
//            return -1;
//        }
//        return minLen;
//    }
//
//    public void dfs(List<Integer> list, int[]coins, int amount, int pos) {
//        if (amount == 0) {
//            minLen = Math.min(minLen, list.size());
//            return;
//        }
//        for (int i = pos; i < coins.length&&amount - coins[i] >= 0; i++) {
//            list.add(coins[i]);
//            dfs(list, coins, amount-coins[i], i);
//            list.remove(list.size()-1);
//        }
//    }

    int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i-coins[j] >= 0 && dp[i-coins[j]] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
                }
            }
        }
        if (dp[amount] == Integer.MAX_VALUE) return -1;
        else return dp[amount];
    }
}
