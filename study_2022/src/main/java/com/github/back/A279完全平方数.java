package com.github.back;

import java.util.Arrays;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.23
 */
public class A279完全平方数 {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min( dp[i-j*j] + 1 , dp[i]);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        new A279完全平方数().numSquares(13);
    }
}
