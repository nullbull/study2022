package com.github.leetcode.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.13
 */
public class A409最长回文串 {

    public int longestPalindrome(String s) {
        char[] chars = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            Integer orDefault = map.getOrDefault(chars[i], 0);
            map.put(chars[i], orDefault + 1);
        }

        int sum = 0;
        int max = 0;
        Entry<Character, Integer> maxEntry = null;
        for (Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() % 2 == 0) {
                sum += 2;
            } else  {
                if (e.getValue() > max) {
                    max = e.getValue();
                    maxEntry = e;
                }
            }
        }
        if (maxEntry != null) {
            sum += maxEntry.getValue();
        }
        return sum;
    }

}
