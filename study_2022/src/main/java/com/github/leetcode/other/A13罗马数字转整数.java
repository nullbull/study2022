package com.github.leetcode.other;

import java.util.HashMap;
import java.util.Map;

public class A13罗马数字转整数 {


    private static Map<Character, Integer> map = new HashMap<>();
    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int pre = map.get(chars[0]);
        int sum = 0;
        for (int i = 1; i < chars.length; i++) {
            Integer cur = map.get(chars[i]);
            if (cur > pre) {
                sum -= pre;
            } else {
                sum += pre;
            }
            pre = cur;
        }
        return sum + pre;
    }

}
