package com.github.leetcode.singal_stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.23
 */
public class A347前K个高频元素 {

    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            Integer orDefault = map.getOrDefault(n, 0);
            map.put(n, orDefault+1);
        }
        List<Integer> collect = map.entrySet().stream().sorted((a, b) -> b.getValue() - a.getValue()).limit(k)
                .map(Entry::getKey).collect(
                        Collectors.toList());
        int[] res = new int[collect.size()];
        for (int i = 0; i < collect.size(); i++) {
            res[i] = collect.get(i);
        }
        return res;
    }
}
