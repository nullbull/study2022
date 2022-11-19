package com.github.leetcode.sort;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.19
 */
public class A4寻找两个正序数组的中位数 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        if (len1  > len2) return findMedianSortedArrays(nums2, nums1);
        int left = 0;
        int right = len1;
        int mid = (len2+len1 + 1)/ 2;
        while (left < right) {
            int mid1 = left +(right - left)/2;
            int mid2 = mid - mid1;
            if (nums1[mid1] < nums2[mid2-1]) left = mid1 + 1;
            else right = mid1;
        }
        int m1 = left;
        int m2 = mid - left;
        int c1 = Math.max(m1 <= 0 ? Integer.MIN_VALUE : nums1[m1 -1], m2 <= 0 ? Integer.MIN_VALUE : nums2[m2-1]);
        if ((len1 + len2) % 2 == 1) {
            return c1;
        }
        int c2 = Math.min(m1  >= len1? Integer.MAX_VALUE : nums1[m1], m2 >= len2 ? Integer.MAX_VALUE : nums2[m2]);
        return (c1 + c2) * 0.5;
    }

    public static void main(String[] args) {
        new A4寻找两个正序数组的中位数().findMedianSortedArrays(new int[]{1,2}, new int[]{3,4});
    }
}
