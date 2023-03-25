package com.github.back;

/**
 * @author niuzhenhao
 * @date 2023/3/25 15:30
 * @desc
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
        int l = left;
        int r = right;
        while (l < r) {
            while (l < r && nums[r] <= nums[left]) r--;
            while (l < r && nums[l] >= nums[left]) l++;
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
        }
        int temp = nums[left];
        nums[left] = nums[r];
        nums[r] = temp;
        if (l == k - 1) {
            res = nums[l];
            return;
        }
        if (l + 1 < k) {
            quickSort(nums, l + 1, right, k);
        } else {
            quickSort(nums, left, l - 1, k);
        }
    }


}
