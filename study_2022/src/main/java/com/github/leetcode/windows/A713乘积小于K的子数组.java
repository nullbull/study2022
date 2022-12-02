package com.github.leetcode.windows;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.29
 */
public class A713乘积小于K的子数组 {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int sum = 1;
        int j = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum * nums[i];
            while (sum >= k && j < nums.length) {
                sum = sum / nums[j++];
            }
            if (sum < k) {
                count += i - j + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        new A713乘积小于K的子数组().numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100);
    }
}
