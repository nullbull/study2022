package com.github.leetcode.backtracing;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.21
 */
public class A40组合总和II {

    public List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        dfs(new ArrayList<>(), nums, 0, target);
        return res;
    }
    public void dfs(List<Integer> list, int[] nums, int pos, int target) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(list));
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = pos; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1] && set.contains(nums[i])) {
                continue;
            }
            list.add(nums[i]);
            set.add(nums[i]);
            dfs(list, nums, i + 1, target - nums[i]);
            list.remove(list.size()-1);
        }
    }
}
