package com.github.offer;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.27
 */
public class A56II数组中数字出现的次数II {

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
            if (count % 3 != 0) {
                res += Math.pow(2, i);
            }
        }
        return res;
    }
}
