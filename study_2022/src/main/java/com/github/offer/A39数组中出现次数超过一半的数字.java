package com.github.offer;

import java.util.Arrays;
import java.util.Collections;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.17
 */
public class A39数组中出现次数超过一半的数字 {

    public int majorityElement(int[] nums) {
//        int[] ints = Arrays.stream(nums).sorted().toArray();
//        int mid = nums.length / 2;
//        return ints[mid];
        int res = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count++;
                res = nums[i];
            } else {
                if (res == nums[i]) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return res;
    }

}
