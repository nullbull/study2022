package com.github.leetcode.backtracing;

import java.util.ArrayList;
import java.util.List;

/**
 * @author niuzhenhao
 * @date 2023/3/25 22:40
 * @desc
 */
public class A22括号生成 {

    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        dfs("", n, n);
        return res;
    }

    public void dfs(String sb, int left, int right) {
        if (left == 0 && right == 0) {
            res.add(sb.toString());
            return;
        }
        if (left > right) {
            return;
        }
        if (left > 0) {
            dfs(sb + "(", left - 1, right);
        }
        if (right > 0) {
            dfs(sb + ")", left, right - 1);
        }
    }

    public static void main(String[] args) {
        List<String> strings = new A22括号生成().generateParenthesis(3);
        strings.forEach(a-> System.out.println(a));
    }
}
