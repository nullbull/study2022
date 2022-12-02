package com.github.offer;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.30
 */
public class II006排序数组中两个数字之和 {

    public int[] twoSum(int[] numbers, int target) {
        int mid = target / 2;
        while (mid >= numbers[0]) {
            int pos = findLeft(numbers, mid);
            int right = findRight(numbers, target - mid);
            if (pos != -2 && right != -2) {
                return new int[]{Math.min(pos, right), Math.max(pos, right)};
            }
            mid--;
        }
        return new int[]{};
    }


    public int findRight(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int r = -2;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
                r = right;
            } else {
                left = mid + 1;
            }
        }
        if (r + 1 >= 0 && nums[r+1] == target) {
            return r+1;
        }
        return -2;
    }


    public int findLeft(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int l = -2;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
                l = left;
            } else {
                right = mid - 1;
            }
        }
        if (l - 1 >= 0 && nums[l-1] == target) {
            return l-1;
        }
        return -2;
    }

    public static void main(String[] args) {
        new II006排序数组中两个数字之和().twoSum(new int[]{0, 0, 3, 4}, 0);
    }
}
