package com.github.leetcode.nums;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.25
 */
public class A303区域和检索数组不可变 {

    class NumArray {

        int[] sum;
        int[] nums;
        public NumArray() {
        }

        public NumArray(int[] nums) {
            if (nums.length > 0) {
                sum = new int[nums.length];
                sum[0] = nums[0];
            }
            for (int i = 1; i < nums.length; i++) {
                sum[i] = sum[i - 1] + nums[i];
            }
            this.nums = nums;
        }

        public int sumRange(int left, int right) {
            if (left >= 0 && right < nums.length) {
                if (left == 0) {
                    return sum[right];
                } else {
                    return sum[right] - sum[left] + nums[left];
                }
            }
            return 0;
        }
    }

}
