package com.github.leetcode.nums;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.28
 */
public class A905按奇偶排序数组 {

    public int[] sortArrayByParity(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            if (nums[l] % 2 == 1 && nums[r] % 2 == 0) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
            } else if (nums[l] % 2 == 1 && nums[r] % 2 == 1) {
                r--;
            } else if (nums[l] % 2 == 0 && nums[r] % 2 == 0) {
                l++;
            } else {
                l++;
                r--;
            }
        }
        return nums;
    }
}
