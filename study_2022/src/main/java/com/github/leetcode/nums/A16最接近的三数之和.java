package com.github.leetcode.nums;

import java.util.Arrays;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.27
 */
public class A16最接近的三数之和 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = nums[l] + nums[i] + nums[r];
                if (Math.abs(sum - target) <= Math.abs(res - target)) {
                    res = sum;
                }
                if (sum > target) {
                    r--;
                } else if (sum < target) {
                    l++;
                } else {
                    res = sum;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        new A16最接近的三数之和().threeSumClosest(new int[]{1, -1, 2, 4}, 1);
    }
}
