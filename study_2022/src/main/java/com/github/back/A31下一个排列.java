package com.github.back;

import java.util.Arrays;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.01
 */
public class A31下一个排列 {

    public void nextPermutation(int[] nums) {
        int pos = 0;
        for (int i = nums.length-2; i >= 0; i--) {
            if (nums[i] < nums[i+1]) {
                pos = i;
                break;
            }
        }
        int left = nums.length - 1;
        for (int i = pos; i < nums.length; i++) {
            if (nums[i] > pos) {
                left = i;
            }
        }
        int temp = nums[pos];
        nums[pos] = nums[left];
        nums[left] = temp;
        Arrays.sort(nums, pos+1, nums.length);
        System.out.println(nums);
    }

    public static void main(String[] args) {
        new A31下一个排列().nextPermutation(new int[]{5,4,3,2,1});
//        new A31下一个排列().nextPermutation(new int[]{1,2,3});
    }

}
