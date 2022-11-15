package com.github.offer;

import java.util.Arrays;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.15
 */
public class A11旋转数组的最小数字 {
    public int minArray(int[] numbers) {
        int l = 0;
        int r = numbers.length - 1;
//        if (numbers.length <= 3) return
        while (l < r) {
            int mid = (l + r) / 2;
            if (numbers[mid] < numbers[r]) r = mid;
            else if (numbers[mid] > numbers[r] ) l = mid +1  ;
            else r--;
        }
        return numbers[l];
    }

    public static void main(String[] args) {
        new A11旋转数组的最小数字().minArray(new int[]{2,2,2, 0, 1});
    }

}
