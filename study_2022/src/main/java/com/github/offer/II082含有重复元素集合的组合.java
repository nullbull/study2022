package com.github.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.26
 */
public class II082含有重复元素集合的组合 {


    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        dfs(new ArrayList<>(), nums, target, 0);
        return res;
    }

    public void dfs(List<Integer> list, int[] nums, int target, int pos) {
        if (target <0) return;
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        HashSet<Integer> used = new HashSet<>();
        for (int i = pos; i < nums.length; i++) {
            if(i > 0 && used.contains(nums[i])) continue;
            list.add(nums[i]);
            used.add(nums[i]);
            dfs(list, nums, target-nums[i], i + 1);
            list.remove(list.size()-1);
        }
    }

}
