package com.github.leetcode.nums;

import java.util.HashSet;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.21
 */
public class A128最长连续序列 {

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int max = 1;
        for (int n : nums) {
            int cur = n;
            if (!set.contains(cur-1)) {
                while (set.contains(cur+1)) {
                    cur = cur + 1;
                }
                max = Math.max(max, cur-n);
            }
        }
        return max;
    }

}
