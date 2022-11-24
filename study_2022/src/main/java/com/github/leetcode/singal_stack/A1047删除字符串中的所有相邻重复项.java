package com.github.leetcode.singal_stack;

import java.util.Stack;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.24
 */
public class A1047删除字符串中的所有相邻重复项 {
    public String removeDuplicates(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (stack.isEmpty()) {
                stack.push(chars[i]);
            } else {
                if (stack.peek() == chars[i]) {
                    while (!stack.isEmpty() && stack.peek() == chars[i]) {
                        stack.pop();
                    }
                } else {
                    stack.push(chars[i]);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
