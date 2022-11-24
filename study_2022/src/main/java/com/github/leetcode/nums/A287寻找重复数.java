package com.github.leetcode.nums;

import java.util.Arrays;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.20
 */
public class A287寻找重复数 {

    public int findDuplicate(int[] nums) {
//        nums = Arrays.stream(nums).sorted().toArray();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                if (nums[nums[i]] == nums[i]) {
                    return nums[i];
                } else {
                    int temp = nums[i];
                    int temp2 = nums[temp];
                    nums[temp] = temp;
                    nums[i] = temp2;
                    i--;
                }
            }
        }
       return -1;
    }

    public static void main(String[] args) {
        new A287寻找重复数().findDuplicate(new int[]{1,3,4,2,1});
    }
}
