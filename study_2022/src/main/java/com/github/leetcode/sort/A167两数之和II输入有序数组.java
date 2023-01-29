package com.github.leetcode.sort;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.30
 */
public class A167两数之和II输入有序数组 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) return new int[]{left+1, right+1};
            else if (numbers[left] + numbers[right] > target) right--;
            else left++;
        }
        return new int[]{};
    }
}
