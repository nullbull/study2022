package com.github.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.17
 */
public class A38字符串的排列 {

    Set<String> list = new HashSet<>();
    public String[] permutation(String s) {
        char[] chars = s.toCharArray();
        boolean[] visited = new boolean[chars.length];
        dfs(chars, new StringBuilder(), visited);
        return list.toArray(new String[0]);

    }
    public void dfs(char[] set, StringBuilder sb, boolean[] visited) {
        if (sb.toString().length() == set.length) {
            list.add(sb.toString());
        }
        for (int i = 0; i < set.length; i++){
            if (!visited[i]) {
                sb.append(set[i]);
                visited[i] = true;
                dfs(set, sb, visited);
                sb.deleteCharAt(sb.length()-1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        new A38字符串的排列().permutation("aab");
    }
}
