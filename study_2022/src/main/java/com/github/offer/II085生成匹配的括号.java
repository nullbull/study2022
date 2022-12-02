package com.github.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.27
 */
public class II085生成匹配的括号 {

    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        dfs(res, new StringBuilder(), n, 0, 0);
        return res;
    }

    public void dfs(List<String> res, StringBuilder sb, int n, int leftCount, int rightCont) {
        if (sb.length() == n * 2) {
            res.add(sb.toString());
            return;
        }
        if (leftCount < n) {
            sb.append("(");
            dfs(res, sb, n, leftCount+1, rightCont);
            sb.deleteCharAt(sb.length()-1);
        }
        if (rightCont < leftCount){
            sb.append(")");
            dfs(res, sb, n, leftCount, rightCont+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main(String[] args) {
        new II085生成匹配的括号().generateParenthesis(3).forEach(System.out::println);
    }
}
