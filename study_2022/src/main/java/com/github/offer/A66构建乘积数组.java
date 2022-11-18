package com.github.offer;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.18
 */
public class A66构建乘积数组 {
    public int[] constructArr(int[] a) {
        int[] dp = new int[a.length];
        int cur = 1;
        for (int i = 1; i < a.length; i++) {
            dp[i] = cur * a[i-1];
            cur = cur * a[i-1];
        }
        cur = dp[a.length-1];
        for (int i = a.length - 1; i >= 0; i--) {
            dp[i] = cur * a[i];
            cur = cur * a[i];
        }
        return dp;
    }
}
