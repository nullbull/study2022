package com.github.offer;

import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.17
 */
public class A50第一个只出现一次的字符 {
    public char firstUniqChar(String s) {
        int[] show_time = new int[26];
        for (char c : s.toCharArray()) {
            show_time[c-'a']++;
        }
        for (char c : s.toCharArray()) {
            if (show_time[c-'a'] == 1) return c;
        }
        return ' ';
    }
}
