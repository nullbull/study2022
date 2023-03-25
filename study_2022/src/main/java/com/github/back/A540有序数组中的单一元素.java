package com.github.back;

/**
 * @author niuzhenhao
 * @date 2023/3/25 11:31
 * @desc
 */
public class A540有序数组中的单一元素 {

    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (mid / 2 == 1) {
                if (mid > 0 && nums[mid] == nums[mid-1]) {
                    left = mid + 1;
                } else if (mid + 1 < nums.length - 1 && nums[mid] == nums[mid+1]) {
                    right = mid - 1;
                } else {
                    return nums[mid];
                }
            } else {
                if (mid > 0 && nums[mid] == nums[mid-1]) {
                    right = mid - 1;
                } else if (mid + 1 < nums.length - 1 && nums[mid] == nums[mid+1]) {
                    left = mid + 1;
                } else {
                    return nums[mid];
                }
            }
        }
        return nums[left];
    }
}
