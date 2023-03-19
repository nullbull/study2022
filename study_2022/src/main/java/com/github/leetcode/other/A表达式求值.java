package com.github.leetcode.other;

import java.util.Stack;

public class A表达式求值 {

    public int compute(String s) {
        char[] chars = s.toCharArray();
        Stack<Integer> numStack = new Stack<>();
        Stack<Character> exp = new Stack<>();
        String cur = "";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                exp.push(chars[i]);
            } else if (chars[i] == '+' || chars[i] == '-' || chars[i] == '*' || chars[i] == '/') {
                exp.push(chars[i]);
                numStack.push(Integer.parseInt(cur));
                cur = "";
            } else if (chars[i] == ')') {
                numStack.push(Integer.parseInt(cur));
                cur = "";
                while (exp.peek() != '(') {
                    char c = exp.pop();
                    int num1 = numStack.pop();
                    int num2 = numStack.pop();
                    numStack.push(doCompute(num1, num2, c));
                }
                exp.pop();
            } else {
                cur += chars[i];
            }
        }
        if (!cur.equals("")) {
            numStack.push(Integer.parseInt(cur));
        }
        while (!exp.isEmpty()) {
            char c = exp.pop();
            int num1 = numStack.pop();
            int num2 = numStack.pop();
            numStack.push(doCompute(num1, num2, c));
        }
        return numStack.pop();
    }

    public int doCompute(int num1, int num2, char exp) {
        switch (exp) {
            case '+': {
                return num1 + num2;
            }
            case '-': {
                return num2 - num1;
            }
            case '*' :
                return num1 * num2;
            case '/' :
                return num2 / num1;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(new A表达式求值().compute("3*(5+6)"));
    }

}
