package com.github.offer;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.18
 */
public class A60n个骰子的点数 {
    public double[] dicesProbability(int n) {

        int[][] dp = new int[n+1][n*6+6];
        for (int i = 1; i <= 6; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= i * 6; j++) {
                for (int k = 1; k <= 6; k++) {
                    if (k > j) continue;
                    dp[i][j] += dp[i-1][j-k];
                }
            }
        }
        double total = Math.pow( 6, n);
        double[] res = new double[n*5+1];
        for (int i = n, j = 0; j < n*5+1; i++, j++) {
            res[j] = dp[n][i] / total;
        }
        return res;
    }

    public static void main(String[] args) {
        new A60n个骰子的点数().dicesProbability(2);
    }
}
