package com.github.leetcode.backtracing;

import java.util.ArrayList;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.21
 */
public class A39组合总和 {

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(new ArrayList<>(), candidates, target, 0, 0);
        return res;
    }
    public void dfs(List<Integer> list, int[]nums, int target, int startPos, int sum) {
        if (target < sum) return;
        if (target == sum) {
            res.add(new ArrayList<>(list));
        }
        for (int i = startPos; i < nums.length; i++) {
            list.add(nums[i]);
            sum += nums[i];
            dfs(list, nums, target, i, sum);
            list.remove(list.size()-1);
            sum -= nums[i];
        }
    }
}
