package com.github.leetcode.dp;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.21
 */
public class A1143最长公共子序列 {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length() + 1][text2.length()+1];
        char[] chars = text1.toCharArray();
        char[] chars2 = text2.toCharArray();
        int max = -1;
        for (int i = 1; i < chars.length; i++ ) {
            for (int j = 1; j < chars2.length; j++) {
                if (chars[i-1] == chars[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
                max = Math.max(dp[i][j], max);
            }
        }
        return max;
    }
}
