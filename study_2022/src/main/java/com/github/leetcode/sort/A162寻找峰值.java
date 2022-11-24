package com.github.leetcode.sort;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.22
 */
public class A162寻找峰值 {

//    public int findPeakElement(int[] nums) {
//        int left = 0;
//        int right = nums.length - 1;
//        while (left < right) {
//            int mid = (left + right) / 2;
//            if (mid > 0 && mid < nums.length - 1) {
//                if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
//                    return mid;
//                }
//            }
//            left = mid + 1;
//
//        }
//        left = 0;
//        right = nums.length - 1;
//        while (left < right) {
//            int mid = (left + right) / 2;
//            if (mid > 0 && mid < nums.length - 1) {
//                if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
//                    return mid;
//                }
//            }
//            right = mid - 1;
//        }
//        return -1;
//    }

    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < nums[mid+1])  right = mid;
            else left = mid;
        }
        return left;
    }

    public static void main(String[] args) {
        int res = new A162寻找峰值().findPeakElement(new int[]{1, 2, 3, 1});
        System.out.println(res);
    }
}
