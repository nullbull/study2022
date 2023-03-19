package com.github.leetcode.windows;

public class A1004最大连续1的个数III {

    public int longestOnes(int[] nums, int k) {
        int left = 0 ;
        int right = 0;
        int maxLen = 0;
        int size = 0;
        while (right < nums.length) {
            if (nums[right++] == 0) {
                size++;
            }
            while (size > k) {
                if (nums[left] == 0) {
                    size--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
