package com.github.leetcode.singal_stack;

import java.util.Stack;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.14
 */
public class A20有效的括号 {

    public boolean isValid(String s) {
        if (s == null) return false;
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char aChar : chars) {
            if (aChar == '(' || aChar == '{' || aChar == '[')
                stack.push(aChar);
            if (aChar == ')' || aChar == ']' || aChar == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.peek() == '(' && aChar == ')')
                    stack.pop();
                else if (stack.peek() == '[' && aChar == ']')
                    stack.pop();
                else if (stack.peek() == '{' && aChar == '}')
                    stack.pop();
            }
        }
        return stack.isEmpty();
    }

}
