package com.github.offer;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.16
 */
public class A21调整数组顺序使奇数位于偶数前面 {

    public int[] exchange(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            while (j > i && nums[j] % 2 == 0) j--;
            while (j > i && nums[i] % 2 == 1) i++;
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
//            if (nums[i] % 2 == 0 && nums[j] % 2 == 1) {
//
//            }
        }
        return nums;
    }

    public static void main(String[] args) {
        new A21调整数组顺序使奇数位于偶数前面().exchange(new int[]{1, 2, 3, 4});
    }
}
