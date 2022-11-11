package com.github.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.11
 */
public class A15三数之和 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 3) {
            return res;
        }
        int[] nums_ = Arrays.stream(nums).sorted().toArray();
        nums = nums_;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return res;
            }
            if (i  > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] + nums[i] == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                } else if (nums[left] + nums[right] + nums[i] > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        new A15三数之和().threeSum(new int[]{-1,0,1,2,-1,-4});
    }
}
