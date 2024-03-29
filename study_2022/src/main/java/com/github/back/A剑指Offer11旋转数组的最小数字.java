package com.github.back;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2023.01.09
 */
public class A剑指Offer11旋转数组的最小数字 {

    public int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (numbers[mid] < numbers[right]) {
                right = mid - 1;
            } else if (numbers[mid] > numbers[right]){
                left = mid + 1;
            } else {
                right--;
            }
        }
        return numbers[left];
    }
}
