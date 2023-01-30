package com.github.leetcode.backtracing;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2023.01.30
 */
public class 第K大个数包含重复元素 {

    int res = -1;

    public int findKth(int[] a, int n, int K) {
        quickSort(a, 0, n - 1, K);
        return res;
    }

    public void quickSort(int[] nums, int left, int right, int k) {
        if (left > right) {
            return;
        }
        int l = left;
        int r = right;
        while (l < r) {
            while (l < r && nums[r] <= nums[left]) {
                r--;
            }
            while (l < r && nums[l] >= nums[left]) {
                l++;
            }
            if (l < r) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
            }
        }
        int temp = nums[left];
        nums[left] = nums[l];
        nums[l] = temp;
        if (k - 1 == l) {
            res = nums[l];
            return;
        }
        if (k - 1 > l) {
            quickSort(nums, l + 1, right, k);
        } else {
            quickSort(nums, left, l - 1, k);
        }
    }
}
