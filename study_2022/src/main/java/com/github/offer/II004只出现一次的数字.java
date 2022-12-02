package com.github.offer;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.28
 */
public class II004只出现一次的数字 {

    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] & 1) == 1) {
                    count++;
                }
                nums[j] >>= 1;
            }
            if (count > 0 && count % 3 != 0) {
                res += (1<<i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        new II004只出现一次的数字().singleNumber(new int[]{2,2,3,2});
    }
}
