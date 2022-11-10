package com.github.offer;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.09
 */
public class A45把数组排成最小的数 {

    public String minNumber(int[] nums) {
        String[] nums_str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums_str[i] = nums[i] + "";
        }
        quickSort(nums_str, 0, nums_str.length - 1);
        return Arrays.stream(nums_str).collect(Collectors.joining());
    }

    public void quickSort(String[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int i = left;
        int j = right;
        String temp = nums[left];
        while (i < j) {
            while ((nums[left] + nums[j]).compareTo(nums[j] + nums[left]) <= 0 && j > i) j--;
            while ((nums[left] + nums[i]).compareTo(nums[i] + nums[left]) >= 0 && i < j) i++;
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        temp = nums[left];
        nums[left] = nums[i];
        nums[i] = temp;
        quickSort(nums, left, i - 1);
        quickSort(nums, i + 1, right);
    }

    public static void main(String[] args) {
        String number = new A45把数组排成最小的数().minNumber(new int[]{3,30,34,5,9});
        System.out.println(number);
    }






}
