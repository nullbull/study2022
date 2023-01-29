package com.github.back;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.30
 */
public class A面试题1003搜索旋转数组 {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < nums[right]) {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (target < nums[mid] && target >= nums[left]) {
                    left = mid - 1;
                } else {
                    right = mid + 1;
                }
            }
        }
        return -1;
    }
}
