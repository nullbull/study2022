package com.github.leetcode.singal_stack;

import java.util.Stack;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.12
 */
public class A1249移除无效的括号 {

    public String minRemoveToMakeValid(String s) {
        boolean[] valid = new boolean[s.length()];
        char[] chars = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push(i);
                valid[i] = true;
            } else if (chars[i] == ')') {
                if (stack.isEmpty()) {
                    valid[i] = true;
                }  else {
                    valid[stack.pop()] = false;
                    valid[i] = false;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (valid[i]) {
                continue;
            }
            sb.append(chars[i]);
        }
        return sb.toString();
    }

}
