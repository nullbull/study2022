package com.github.offer;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.14
 */
public class A03数组中重复的数字 {

    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                if (nums[nums[i]] == nums[i]) return nums[i];
                else {
                    //交换 nums[nums[i]] 和 nums[i]
                    int temp = nums[i];
                    int temp2 = nums[temp];
                    nums[i] = temp2;
                    nums[temp] = temp;
                }
            }
        }
        return -1;
    }
}
