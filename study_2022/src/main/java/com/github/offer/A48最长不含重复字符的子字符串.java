package com.github.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.18
 */
public class A48最长不含重复字符的子字符串 {

    public int lengthOfLongestSubstring(String s) {

        char[] chars = s.toCharArray();
        int i = 0;
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int l = 0;
        while (i < s.length()) {
            if (map.containsKey(chars[i])) {
                l = Math.max(l, map.get(chars[i]));
            }
            map.put(chars[i], i);
            max = Math.max(max, i - l);
            i++;
        }
        return max;
    }

    public static void main(String[] args) {
//        new A48最长不含重复字符的子字符串().lengthOfLongestSubstring("abcabcbb");
        new A48最长不含重复字符的子字符串().lengthOfLongestSubstring("pwwkew");
    }
}
