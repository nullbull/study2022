package com.github.leetcode.sort;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.22
 */
public class A34在排序数组中查找元素的第一个和最后一个位置 {

    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int l = -2;
        int r = -2;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target >= nums[mid]) {
                left = mid + 1;
                r = left;
            } else {
                right = mid - 1;
            }
        }
        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target <= nums[mid]) {
                right = mid - 1;
                l = right;
            } else {
                left = mid + 1;
            }
        }
        if (l == -2 || r == -2) {
            return new int[]{-1, -1};
        }
        if (r-l > 1) {
            return new int[]{l + 1, r - 1};
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        new A34在排序数组中查找元素的第一个和最后一个位置().searchRange(new int[]{2,2}, 2);
    }
}
