package com.github.leetcode.sort;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.15
 */
public class HeapSort {


    public void buildHeap(int[] nums) {
        for (int i = nums.length / 2 - 1; i >=0; i--) {
            adjustHeap(nums, i, nums.length);
        }
    }

    public void adjustHeap(int[] nums, int index, int length) {
        int temp = nums[index];
        for (int i = index * 2 + 1; i < length; i = i * 2 + 1) {
            if (i + 1 < length && nums[i+1] > nums[i]) {
                i++;
            }
            if (nums[i] > temp) {
                nums[index] = nums[i];
                index = i;
            }
        }
        nums[index] = temp;
    }

    public void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 7, 8, 5, 6, 9};
        new HeapSort().buildHeap(nums);
        Arrays.stream(nums).forEach(System.out::println);
    }
}
