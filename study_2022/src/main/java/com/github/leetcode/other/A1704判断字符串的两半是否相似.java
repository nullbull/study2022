package com.github.leetcode.other;

import java.util.HashMap;
import java.util.Locale;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.11
 */
public class A1704判断字符串的两半是否相似 {

    public boolean halvesAreAlike(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('e', 1);
        map.put('i', 1);
        map.put('o', 1);
        map.put('u', 1);
        char[] chars = s.toLowerCase().toCharArray();
        int mid =  chars.length / 2;
        int half1 = 0;
        int half2 = 0;
        for (int i = 0; i < mid; i++) {
            if (map.containsKey(chars[i])) {
                half1 ++;
            }
        }
        for (int i = mid; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                half2 ++;
            }
        }
        return half1 == half2;
    }

}
