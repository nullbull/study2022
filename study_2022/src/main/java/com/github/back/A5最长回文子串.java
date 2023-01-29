package com.github.back;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.13
 */
public class A5最长回文子串 {
    public String longestPalindrome(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < dp.length; i++) {
            dp[i][i] = true;
        }
        char[] chars = s.toCharArray();
        int l = 0;
        int r = 0;
        int maxLen = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i ; j < s.length(); j++) {
                if (chars[i] == chars[j]) {
                    if (j - i <= 1) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                    if (dp[i][j]) {
                        if (j - i + 1 > maxLen) {
                            maxLen = j - i + 1;
                            l = i;
                            r = j;
                        }
                    }
                }
            }
        }
        return s.substring(l, r);
    }
}
