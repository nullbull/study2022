package com.github.offer;

/**
 * this is an desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.16
 */
public class A15二进制中1的个数 {

    public int hammingWeight(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            n &= (n - 1);
        }
        return sum;
    }
}
