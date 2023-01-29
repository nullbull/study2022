package com.github.leetcode.string;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2023.01.04
 */
public class A459重复的子字符串 {

    public boolean repeatedSubstringPattern(String s) {
        char[] chars = s.toCharArray();
        for (int i = 1; i <= s.length() / 2; i++) {
            if (chars.length % i != 0) {
                continue;
            }
            int slow = 0;
            int fast = slow + i;
            while (fast < s.length()) {
                if (chars[fast] == chars[slow]) {
                    fast++;
                    slow++;
                } else {
                    break;
                }
            }
            if (fast == s.length()) {
                return true;
            }
        }
        return false;
    }
}
