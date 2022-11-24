package com.github.leetcode.backtracing;

import java.util.ArrayList;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.24
 */
public class A216组合总和III {

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        dfs(new ArrayList<>(), k, n, 0);
        return res;
    }

    public void dfs(List<Integer> list, int k, int target, int pos) {
        if (target < 0) return;
        if (list.size() == k && target == 0) {
            res.add(new ArrayList<>(list));
        }

        for (int i = pos; i <= 9; i++) {
            list.add(i);
            dfs(list, k, target-i, i + 1);
            list.remove(list.size()-1);
        }
    }

}
