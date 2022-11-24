package com.github.leetcode.backtracing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.24
 */
public class A17电话号码的字母组合 {
    HashMap<Integer, char[]> map = new HashMap<>();

    {
        map.put(2, new char[]{'a','b','c'});
        map.put(3, new char[]{'d','e','f'});
        map.put(4, new char[]{'g','h','i'});
        map.put(5, new char[]{'j','k','l'});
        map.put(6, new char[]{'m','n','o'});
        map.put(7, new char[]{'p','q','r', 's'});
        map.put(8, new char[]{'t','u','v'});
        map.put(9, new char[]{'w','x','y', 'z'});
    }
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        char[] chars = digits.toCharArray();
        List<String> res = new ArrayList<>();
        boolean[] hasVisited = new boolean[chars.length];
        dfs(res, chars, new StringBuilder(), 0, hasVisited);

        return res;
    }
    public void dfs(List<String> res, char[] chars, StringBuilder sb, int pos, boolean[] hasVisited) {
        if (pos == chars.length) {
            res.add(sb.toString());
            return;
        }
        for (char c : map.get(chars[pos] - '0')) {
            sb.append(c);
            dfs(res, chars, sb, pos+1, hasVisited);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
