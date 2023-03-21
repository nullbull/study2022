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


    public void buildHeap(int[] nums, int len, int parent) {
        int temp = nums[parent];
        int child = parent * 2 + 1;
        while (child < len) {
            if (child + 1 < len && nums[child+1] > nums[child]) {
                child = child + 1;
            }
            if (temp >= nums[child]) {
                break;
            }
            nums[parent] = nums[child];
            parent = child;
            child = parent * 2 + 1;
        }
        nums[parent] = temp;
    }

    public void heap(int[] nums) {
        for (int i = nums.length / 2 - 1 ; i >= 0; i--) {
            buildHeap(nums, nums.length, i);
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;
            buildHeap(nums, i, 0);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 7, 9, 4, 5, 3};
        new AHeap().heap(a);
        System.out.println(Arrays.stream(a).boxed().map(b -> b.toString()).collect(Collectors.joining(",")));
    }

}
