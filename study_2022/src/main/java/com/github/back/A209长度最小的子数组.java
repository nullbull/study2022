package com.github.back;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.26
 */
public class A209长度最小的子数组 {

    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        int sum = 0;
        while (j < nums.length) {
            sum += nums[j];
            while (sum >= target) {
                min = Math.min(min, j - i + 1);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
