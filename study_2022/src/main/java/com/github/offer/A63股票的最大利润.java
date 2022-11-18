package com.github.offer;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.18
 */
public class A63股票的最大利润 {

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(prices[i], minPrice);
            max = Math.max(max, prices[i] - minPrice);
        }
        return max;
    }

    public static void main(String[] args) {
        new A63股票的最大利润().maxProfit(new int[]{7, 1, 5, 3, 6, 4});
    }

}
