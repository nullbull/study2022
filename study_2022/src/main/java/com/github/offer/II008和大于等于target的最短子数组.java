package com.github.offer;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.25
 */
public class II008和大于等于target的最短子数组 {

    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int len = Integer.MAX_VALUE;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                len = Math.min(i - j, len);
                sum -= nums[j++];
            }
        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }
}
