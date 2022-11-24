package com.github.leetcode.backtracing;

import java.util.ArrayList;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.22
 */
public class A78子集 {

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {

        dfs(new ArrayList<>(), nums, 0);
        return res;
    }
    public void dfs(List<Integer> list, int[] nums, int pos) {
        res.add(new ArrayList<>(list));
        for (int i = pos; i < nums.length; i++) {
            list.add(nums[i]);
            dfs(list, nums, pos + 1);
            list.remove(list.size()-1);
        }
    }

}
