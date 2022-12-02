package com.github.leetcode.dp;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.30
 */
public class A647回文子串 {

    public int countSubstrings(String s) {
        char[] chars = s.toCharArray();
        boolean dp[][] = new boolean[s.length()][s.length()];
        for (int i = 0; i < chars.length; i++) {
            dp[i][i] = true;
        }
        int count = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            for (int j = i; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    if (j - i <= 1) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
                if (dp[i][j]) count++;
            }
        }
        return count;
    }
}
