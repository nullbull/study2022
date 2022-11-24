package com.github.leetcode.nums;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.20
 */
public class A31下一个排列 {
    public void nextPermutation(int[] nums) {
        int r = nums.length -1 ;
        int l = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                l = i;
            }
        }
        for (int i = l + 2; i < nums.length; i++) {
            if (nums[i] > nums[l]) {
                r = i;
            }
        }
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
        Arrays.sort(nums, l+1, nums.length);
        System.out.println("a");
    }

    public static void main(String[] args) {
        new A31下一个排列().nextPermutation(new int[]{1,3,2});
    }
}
