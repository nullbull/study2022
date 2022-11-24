package com.github.leetcode.dp;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.24
 */
public class A343整数拆分 {

    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i - 1; j++) {
                dp[i] = Math.max(dp[i], Math.max(dp[i-j] * j, j * (i - j)));
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        new A343整数拆分().integerBreak(10);
    }
}
