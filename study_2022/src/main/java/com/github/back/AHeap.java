package com.github.back;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2023.01.03
 */
public class AHeap {


    public void buildHeap(int[] nums, int len, int p) {
        while (true) {
            if (p > len) {
                break;
            }
            int maxPos = p;
            int left = p * 2 + 1;
            int right = p * 2 + 2;
            if (left <= len && nums[left] > nums[p]) {
                maxPos = left;
            }
            if (right <= len && nums[right] > nums[maxPos]) {
                maxPos = right;
            }
            if (p == maxPos) {
                break;
            }
            int temp = nums[p];
            nums[p] = nums[maxPos];
            nums[maxPos] = temp;
            p = maxPos;
        }
    }

    public void heap(int[] nums) {
        for (int i = nums.length / 2 - 1; i >= 0; i--) {
            buildHeap(nums, nums.length - 1, i);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 7, 9, 4, 5, 3};
        new AHeap().heap(a);
        System.out.println(Arrays.stream(a).boxed().map(b -> b.toString()).collect(Collectors.joining(",")));
    }

}
