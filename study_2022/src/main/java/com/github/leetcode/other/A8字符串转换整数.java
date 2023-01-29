package com.github.leetcode.other;

import java.util.Stack;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2023.01.03
 */
public class A8字符串转换整数 {

    public int myAtoi(String s) {
        s = s.trim();
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        String last = "";
        boolean nagetive = false;
        if (s.length() == 0 ) return 0;
        int index = 0;
        if (chars[index] == '-') {
            nagetive = true;
        }
        if (chars[index] == '-' || chars[index] == '+') {
            index++;
        }
        long res = 0;
        while (index < chars.length && chars[index] >= '0' && chars[index] <= '9') {
            res = res * 10 + chars[index] - '0';
            if (res > Integer.MAX_VALUE) break;
            index++;
        }
        if (nagetive) res = - res;
        if (res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        else if (res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        else return (int) res;
    }

    public static void main(String[] args) {
        System.out.println(new A8字符串转换整数().myAtoi("00000-42a1234"));
    }
}
