package com.github.leetcode.windows;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.30
 */
public class A763划分字母区间 {

    public List<Integer> partitionLabels(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], i);
        }
        int left = 0;
        int right = 0;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            right = Math.max(map.get(chars[i]), right);
            if (right == i) {
                res.add(right - left + 1);
                left++;
            }
        }
        return res;
    }
}
