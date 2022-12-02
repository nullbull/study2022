package com.github.offer;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.27
 */
public class A56I数组中数字出现的次数 {

    public int[] singleNumbers(int[] nums) {
        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        int m = 1;
        while ((a & m) == 0) m <<= 1;
        int x = 0, y = 0;
        for (int i : nums) {
            if ((i & m) == 0) x ^= i;
            else y ^= i;
        }
        return new int[]{x,y};
    }
}
