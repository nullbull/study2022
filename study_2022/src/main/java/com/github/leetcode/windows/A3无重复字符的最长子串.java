package com.github.leetcode.windows;

import java.util.Stack;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.10
 */
public class A3无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
       boolean[] hasShow = new boolean[256];
       char[] chars = s.toCharArray();
       int max = -1;
        for (int i = 0; i < chars.length; i++) {
            int go = i+1;
            hasShow[chars[i]] = true;
            while (go < chars.length && !hasShow[chars[go]]) {
                hasShow[chars[go]] = true;
                go++;
            }
            max = Math.max(max, go - i);
            hasShow = new boolean[256];
        }
        return max;
    }
}
