package com.github.offer;

import java.io.FileReader;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.17
 */
public class A57和为s的两个数字 {

//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            if (find(nums, target - nums[i])) {
//                return new int[]{nums[i], target-nums[i]};
//            }
//        }
//        return new int[]{};
//    }
//    public boolean find(int[] nums, int target) {
//        int i = 0;
//        int j = nums.length - 1;
//        while (i <= j) {
//            int mid = (i + j) / 2;
//            if (nums[mid] == target) return true;
//            else if (nums[mid] > target) j = mid-1;
//            else i = mid + 1;
//        }
//        return false;
//    }


    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] == target)
                return new int[]{nums[i], nums[j]};
            else if (nums[i] + nums[i] < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        new A57和为s的两个数字().twoSum(new int[]{2, 7, 11, 15}, 9);
    }

}
