package com.github.leetcode.backtracing;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.23
 */
public class A560和为K的子数组 {
//    public int subarraySum(int[] nums, int k) {
//        int sum = 0;
//        int i = 0;
//        int count = 0;
//        for (int j = 0; j < nums.length; j++) {
//            sum += nums[j];
//            while (sum >= k) {
//                if (sum == k) count++;
//                sum -= nums[i++];
//            }
//        }
//        return count;
//    }

    public int subarraySum(int[] nums, int k) {
        int[] preSum = new int[nums.length+1];
        int count = 0;
        for (int i = 1 ; i <= nums.length; i++) {
            preSum[i] += preSum[i-1] + nums[i-1];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (preSum[j+1] - preSum[i] == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        new A560和为K的子数组().subarraySum(new int[]{1,2,3}, 3);
        new A560和为K的子数组().subarraySum(new int[]{-1,-1,0}, 0);
    }
}
