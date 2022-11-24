package com.github.leetcode.backtracing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.24
 */
public class A491递增子序列 {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        dfs(new LinkedList<>(), nums, 0);
        return res;
    }

    public void dfs(LinkedList<Integer> list, int[] nums, int pos) {
        if (list.size() >= 2) {
            res.add(new ArrayList<>(list));
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = pos; i < nums.length; i++) {
            if (!list.isEmpty() && list.peekLast() >  nums[i] || set.contains(nums[i]))
                continue;
            list.add(nums[i]);
            set.add(nums[i]);
            dfs(list, nums, i + 1);
            list.pollLast();

        }
    }

    public static void main(String[] args) {
        new A491递增子序列().findSubsequences(new int[]{4, 6, 7, 7});
    }
}
