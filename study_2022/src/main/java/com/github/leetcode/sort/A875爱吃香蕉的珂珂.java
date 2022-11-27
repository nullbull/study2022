package com.github.leetcode.sort;

import java.util.Arrays;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.27
 */
public class A875爱吃香蕉的珂珂 {

    public int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles).max().getAsInt();
        if (piles.length == h) {
            return max;
        }
        Arrays.sort(piles);
        int i = 1;
        int j = max;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (canEat(piles, h, mid)) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return i;
    }

    public boolean canEat(int[] piles, int h, int mid) {
        long maxHour = 0;
        for (int pile : piles) {
            maxHour += (pile % mid == 0) ? (pile / mid) : ( pile / mid) + 1;
        }
        return maxHour <= h;
    }
}
