package com.github.leetcode.string;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.19
 */
public class A14最长公共前缀 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        return dfs(strs, 0, strs.length-1);
    }

    public String dfs(String[] strs, int left, int right) {
        if (left >= right) return strs[left];
        int mid = (left + right) / 2;
        String leftCommon = dfs(strs, left, mid);
        String rightCommon = dfs(strs, mid+1, right);
        return commonPrefix(leftCommon, rightCommon);
    }

    public String commonPrefix(String a, String b) {
        int minLen = Math.min(a.length(), b.length());
        int i = 0;
        while ( i < minLen && a.charAt(i) == b.charAt(i)) {i++;}
        return a.substring(0, i);
    }
}
