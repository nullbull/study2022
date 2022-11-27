package com.github.offer;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.25
 */
public class AII010和为k的子数组 {

    public int subarraySum(int[] nums, int k) {
        int[] sums = new int[nums.length+1];
        sums[0] = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            sums[i+1] = sums[i] + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (sums[j] - sums[i] == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
