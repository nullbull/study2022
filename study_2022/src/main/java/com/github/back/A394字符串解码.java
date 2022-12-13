package com.github.back;

import java.util.Stack;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.11
 */
public class A394字符串解码 {

    public String decodeString(String s) {
        char[] chars = s.toCharArray();
        Stack<String> stack = new Stack<>();
        Stack<Integer> count = new Stack<>();
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <='9') {
                sum = sum * 10 + (chars[i] - '0');
            } else if (chars[i] == '[') {
                stack.push(sb.toString());
                sb = new StringBuilder();
                count.push(sum);
                sum = 0;
            } else if (chars[i] == ']') {
                int v = count.pop();
                StringBuilder temp = new StringBuilder();
                temp.append(stack.pop());
                for (int j = 0; j < v; j++) {
                    temp.append(sb);
                }
                sb = temp;
            } else {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        new A394字符串解码().decodeString("3[a]2[bc]a");
    }

}
