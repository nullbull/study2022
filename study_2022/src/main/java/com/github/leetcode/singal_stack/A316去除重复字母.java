package com.github.leetcode.singal_stack;

import java.util.Stack;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.09
 */
public class A316去除重复字母 {

    public String removeDuplicateLetters(String s) {
        char[] chars = s.toCharArray();
        boolean[] has_show = new boolean[256];
        int[] show_count = new int[256];
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            show_count[chars[i]]++;
        }
        for (int i = 0; i < chars.length; i++) {
            if (!has_show[chars[i]]) {
                while (!stack.isEmpty() && chars[i] < stack.peek() && show_count[stack.peek()] > 1) {
                    show_count[stack.peek()]--;
                    has_show[stack.peek()] = false;
                    stack.pop();
                }
                stack.push(chars[i]);
                has_show[chars[i]] = true;
            } else {
                show_count[chars[i]]--;
            }
        }
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        String res = new A316去除重复字母().removeDuplicateLetters("bcabc");
        System.out.println(res);
        res = new A316去除重复字母().removeDuplicateLetters("cbacdcbc");
        System.out.println(res);
         res = new A316去除重复字母().removeDuplicateLetters("bbcaac");
        System.out.println(res);

    }
}
