package com.github.leetcode.sort;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.11
 */
public class A215数组中的第K个最大元素 {
    int res = 0;
    public int findKthLargest(int[] nums, int k) {
        quickSort(nums, 0, nums.length - 1, k);
        return res;
    }


    public void quickSort(int[] nums, int left, int right, int k) {
        if (left > right) {
            return;
        }
        int i = left;
        int j = right;
        int temp = nums[left];
        while (i < j) {
            while (nums[j] >= nums[left] && j > i) j--;
            while (nums[i] <= nums[left] && i < j) i++;
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        temp = nums[left];
        nums[left] = nums[i];
        nums[i] = temp;
        if (k == nums.length - i) {
            res = nums[i];
            return;
        }
        quickSort(nums, left, i - 1, k);
        quickSort(nums, i + 1, right, k);
    }
}
