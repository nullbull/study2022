package com.github.leetcode.string;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.20
 */
public class A5最长回文子串 {

    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int maxLen = 1;
        int left = 0;
        int right = 0;
        for (int i = 0; i < chars.length; i++) {
            int l = i - 1;
            int r = i + 1;
            while (l >= 0 && r < chars.length && chars[l] == chars[r]) {
                l--;
                r++;
            }
            if ( r-l - 1  > maxLen) {
                maxLen = r - l - 1;
                left = l + 1;
                right = r - 1;
            }

            l = i;
            r = i + 1;
            while (l >= 0 && r < chars.length && chars[l] == chars[r]) {
                l--;
                r++;
            }
            if ( r-l-1 > maxLen) {
                maxLen = r - l - 1;
                left = l + 1;
                right = r - 1;
            }
        }
        return s.substring(left, right+1);
    }

    public static void main(String[] args) {
        new A5最长回文子串().longestPalindrome("cbbd");
    }
}
