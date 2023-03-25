package com.github.back;

import java.util.HashSet;

/**
 * @author niuzhenhao
 * @date 2023/3/25 11:01
 * @desc
 */
public class A剑指offer119最长连续序列 {

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        int res = 1;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i] - 1)) {
                int count = 0;
                while (set.contains(nums[i] + count)) {
                    count++;
                }
                res = Math.max(count, res);
            }
        }
        return res;
    }
}
