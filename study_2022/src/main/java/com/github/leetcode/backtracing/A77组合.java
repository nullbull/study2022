package com.github.leetcode.backtracing;

import java.util.ArrayList;
import java.util.List;

public class A77组合 {

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        dfs(new ArrayList<>(), n, k, 1);
        return res;
    }

    public void dfs(List<Integer> list, int n, int k, int pos) {
        if (list.size() > k) {
            return;
        }
        if (list.size() == k) {
            res.add(new ArrayList<>(list));
        }
        for (int i = pos; i <= n; i++) {
            list.add(i);
            dfs(list, n, k, i + 1);
            list.remove(list.size()-1);
        }
    }
}
