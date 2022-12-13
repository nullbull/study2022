package com.github.leetcode.greedy;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.13
 */
public class A45跳跃游戏II {

    public int jump(int[] nums) {
        int end = 0;
        int maxLength = 0;
        int steps = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxLength = Math.max(nums[i] + i, maxLength);
            if (end == i) {
                end = maxLength;
                steps++;
            }
        }
        return steps;
    }

}
