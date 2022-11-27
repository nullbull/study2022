package com.github.offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.26
 */
public class II081允许重复选择元素的组合 {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        dfs(new ArrayList<>(), nums, target, 0);
        return res;
    }

    public void dfs(List<Integer> list, int[] nums, int target, int pos) {
        if (target <0) return;
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = pos; i < nums.length; i++) {
            list.add(nums[i]);
            dfs(list, nums, target-nums[i], i);
            list.remove(list.size()-1);
        }
    }
}
