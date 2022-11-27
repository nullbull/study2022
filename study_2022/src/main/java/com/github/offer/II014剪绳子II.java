package com.github.offer;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.25
 */
public class II014剪绳子II {
    public int cuttingRope(int n) {
        long[] dp = new long[n+1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i - 1; j++) {
                dp[i] = Math.max(dp[i], Math.max(dp[i-j] * j, (i-j) * j)) ;
            }
        }
        return (int) (dp[n] % 1000000007);
    }

    public static void main(String[] args) {
        new II014剪绳子II().cuttingRope(10);
    }
}
