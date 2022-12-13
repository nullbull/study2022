package com.github.leetcode.greedy;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.13
 */
public class A55跳跃游戏 {

    public boolean canJump(int[] nums) {
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            maxLength = Math.max(nums[i] + i, maxLength);
            if (maxLength == i) {
                return false;
            }
        }
        return true;
    }
}
