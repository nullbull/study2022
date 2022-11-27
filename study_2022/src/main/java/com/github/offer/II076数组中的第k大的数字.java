package com.github.offer;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.25
 */
public class II076数组中的第k大的数字 {

    int res = 0;

    public int findKthLargest(int[] nums, int k) {

        quickSort(nums, 0, nums.length - 1, k);
        return res;
    }

    public void quickSort(int[] nums, int left, int right, int target) {
        if (left > right) {
            return;
        }
        int l = left;
        int r = right;
        while (l < r) {
            while (r > l && nums[r] <= nums[left]) {
                r--;
            }
            while (r > l && nums[l] >= nums[left]) {
                l++;
            }
            int temp = nums[r];
            nums[r] = nums[l];
            nums[l] = temp;
        }

        int temp = nums[left];
        nums[left] = nums[l];
        nums[l] = temp;
        if (l == target) {
            res = nums[l];
            return;
        }
        quickSort(nums, left, l - 1, target);
        quickSort(nums, l + 1, right, target);
    }

    public static void main(String[] args) {
        new II076数组中的第k大的数字().findKthLargest(new int[]{3,2,1,5,6,4}, 2);
    }


}
