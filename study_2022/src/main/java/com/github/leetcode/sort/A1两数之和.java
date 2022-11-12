package com.github.leetcode.sort;

import java.util.Arrays;
import java.util.HashMap;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.12
 */
public class A1两数之和 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ;i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int wanted = target - nums[i];
            if (map.containsKey(wanted)) {
                return new int[]{i, map.get(wanted)};
            }
        }
        return new int[]{};
    }
}
