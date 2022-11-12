package com.github.leetcode.dp;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.12
 */
public class A790多米诺和托米诺平铺 {
    public int numTilings(int n) {
        long[] dp = new long[n+10];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        int mod = (int) 1e9 + 7;

        for (int i = 3; i <= n; i++) {
            dp[i] =  (2 * dp[i-1] + dp[i-3]) % mod;
        }
        return (int)dp[n];
    }
}
