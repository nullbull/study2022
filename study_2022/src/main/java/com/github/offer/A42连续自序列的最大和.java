package com.github.offer;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.16
 */
public class A42连续自序列的最大和 {

    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], nums[i] + dp[i-1]);
            max = Math.max(dp[i], max);
        }
        return max;
    }

    public static void main(String[] args) {
        new A42连续自序列的最大和().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5});
    }

}
