package com.github.leetcode.string;

import java.util.Stack;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.19
 */
public class A394字符串解码 {

//    public String decodeString(String s) {
//        Stack<Integer> stack = new Stack<>();
//        Stack<String> strStack = new Stack<>();
//        StringBuilder sb = new StringBuilder();
//        char[] chars = s.toCharArray();
//        String last = "";
//        for (int i = 0; i < chars.length; ) {
//            if (chars[i] >= '0' && chars[i] <= '9') {
//                String num = "";
//                while (i < chars.length && chars[i] >= '0' && chars[i] <= '9') {
//                    num += chars[i];
//                    i++;
//                }
//                stack.push(Integer.parseInt(num));
//            } else if (chars[i] == '[') {
//                i++;
//                if (!last.equals("")) strStack.push(last);
////                String rep = "";
////                while (i < chars.length && chars[i] >= 'a' && chars[i] <= 'z') {
////                    rep += chars[i];
////                    i++;
////                }
////                strStack.push(rep);
//            } else if (chars[i] == ']') {
//                i++;
//                int count = stack.pop();
//                String rep = strStack.pop() + last;
//                String res = "";
//                for (int j = 0; j < count; j++) {
//                    res += rep;
//                }
//                if (!strStack.isEmpty()) {
//                    strStack.push(res);
//                } else {
//                    last = "";
//                    sb.append(res);
//                }
//            } else {
//                if (stack.isEmpty()) {
//                    sb.append(chars[i]);
//                } else {
//                    last += chars[i];
//                }
//                i++;
//            }
//        }
//        // "zzzpqefjkyyjkyyfjkyyjkyyfjkyyjkyyfjkyyjkyyfjkyyjkyyfjkyyjkyyfjkyyjkyyfjkyyjkyyef"
//        // "2[2[y]pq4[2[jk]e1[f]]]ef"
//        return sb.toString();
//    }
//


    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        Stack<Integer> count = new Stack<>();
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') sum = sum * 10 + (chars[i]- '0');
            else if (chars[i] == '[') {
                stack.push(sb.toString());
                sb = new StringBuilder();
                count.push(sum);
                sum = 0;
            }
            else if (chars[i] == ']') {
                int time = count.pop();
                StringBuilder temp = new StringBuilder();
                for (int j = 0; j < time; j++) {
                    temp.append(sb.toString());
                }
                sb = new StringBuilder().append(stack.pop()).append(temp);
            } else sb.append(chars[i]);
        }
        return sb.toString();
    }
        public static void main(String[] args) {
        new A394字符串解码().decodeString("2[2[y]pq4[2[jk]e1[f]]]");
    }

}
