package com.github.leetcode.backtracing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.19
 */
public class A90子集II {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        nums = Arrays.stream(nums).sorted().toArray();
        dfs(new ArrayList<>(), nums, 0);
        return res;
    }

    public void dfs(List<Integer> list, int[] nums, int start) {
        res.add(new ArrayList<>(list));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i - 1] == nums[i]) {
                continue;
            }
            list.add(nums[i]);
            dfs(list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        new A90子集II().subsetsWithDup(new int[]{1, 2, 2});
    }
}
