package com.github.leetcode.backtracing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.24
 */
public class A47全排列II {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        nums = Arrays.stream(nums).sorted().toArray();
        boolean[] hasVisited = new boolean[nums.length];
        dfs(new ArrayList<>(), nums, hasVisited);
        return res;
    }

    public void dfs(List<Integer> list, int[] nums, boolean[] hasVisited) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
        }
        for (int i = 0; i < nums.length; i++) {
            if (hasVisited[i]) continue;
            if (i > 0 && hasVisited[i-1]  && nums[i-1] == nums[i]) continue;
            list.add(nums[i]);
            hasVisited[i]=true;
            dfs(list, nums, hasVisited);
            hasVisited[i]=false;
            list.remove(list.size()-1);
        }
    }

}
