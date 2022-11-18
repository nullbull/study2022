package com.github.leetcode.backtracing;

import java.util.ArrayList;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.18
 */
public class A46全排列 {

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] isVisited = new boolean[nums.length];
        dfs(new ArrayList<>(), nums, isVisited);
        return res;
    }

    public void dfs(List<Integer> list, int[] nums, boolean[] isVisited) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (isVisited[i]) continue;
            list.add(nums[i]);
            isVisited[i] = true;
            dfs(list, nums, isVisited);
            list.remove(list.size()-1);
            isVisited[i]= false;
        }
    }

    public static void main(String[] args) {
        new A46全排列().permute(new int[]{1,2,3});
    }

}
