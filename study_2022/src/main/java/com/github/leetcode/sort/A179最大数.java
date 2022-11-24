package com.github.leetcode.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.22
 */
public class A179最大数 {

    public String largestNumber(int[] nums) {
        sort(nums, 0, nums.length-1);
        if (nums[0] == 0) return "0";
        return Arrays.stream(nums).mapToObj(String::valueOf).collect(Collectors.joining());
    }

    public void sort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int temp = nums[left];
        int l = left;
        int r = right;
        while (l < r) {
            while (r > l && (String.valueOf(nums[r]) + String.valueOf(temp)).compareTo( String.valueOf(temp) + String.valueOf(nums[r])) <= 0) {
                r--;
            }
            while (r > l && (String.valueOf(nums[l]) + String.valueOf(temp)).compareTo( String.valueOf(temp) + String.valueOf(nums[l])) >= 0) {
                l++;
            }
//            while (r > l && nums[r] <= temp ) r--;
//            while (r > l && nums[l] >= temp ) l++;
            int a = nums[l];
            nums[l] = nums[r];
            nums[r] = a;

        }
        nums[left] = nums[l];
        nums[l] = temp;
        sort(nums, left, l - 1);
        sort(nums, l + 1, right);
    }

    public static void main(String[] args) {
        new A179最大数().largestNumber(new int[]{1,4,7,2,5,8,0,3,6,9});
    }
}
