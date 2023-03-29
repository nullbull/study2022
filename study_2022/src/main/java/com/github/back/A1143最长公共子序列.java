package com.github.back;

/**
 * @author niuzhenhao
 * @date 2023/3/25 12:01
 * @desc
 */
public class A1143最长公共子序列 {


    public int longestCommonSubsequence(String text1, String text2) {
        char[] a = text1.toCharArray();
        char[] b  = text2.toCharArray();
        int[][]dp = new int[text1.length()+1][text2.length()+1];
        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < b.length; j++) {
                if (a[i-1] == b[j-1]) {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[a.length][b.length];
    }
}
