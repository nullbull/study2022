package com.github.leetcode.sort;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.27
 */
public class A540有序数组中的单一元素 {

    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (mid % 2 == 0) {
                if (mid - 1 >= 0 && nums[mid] == nums[mid - 1]) {
                    right = mid - 1;
                } else if (mid + 1 < nums.length && nums[mid] == nums[mid + 1]) {
                    left = mid + 1;
                } else {
                    return nums[mid];
                }
            } else {
                if (mid - 1 >= 0 && nums[mid] == nums[mid - 1]) {
                    left = mid + 1;
                } else if (mid + 1 < nums.length && nums[mid] == nums[mid + 1]) {
                    right = mid - 1;
                } else {
                    return nums[mid];
                }
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
//        new A540有序数组中的单一元素().singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8});
        new A540有序数组中的单一元素().singleNonDuplicate(new int[]{1, 2, 2, 3, 3, 4, 4, 8, 8});
    }
}
