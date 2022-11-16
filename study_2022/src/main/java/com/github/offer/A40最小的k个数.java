package com.github.offer;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.16
 */
public class A40最小的k个数 {
    int[] ans;
    public int[] getLeastNumbers(int[] arr, int k) {
       ans  = new int[k];
       quickSort(arr, 0, arr.length - 1, k);
        if (k == arr.length) ans = arr;
       return ans;
    }

    public void quickSort(int[] nums, int l, int r, int k) {
        if (l > r) return;
        int i = l;
        int j = r;
        int temp =nums[l];
        while (i < j) {
            while (j > i && nums[j] >= nums[l]) j--;
            while (j > i && nums[i] <= nums[l]) i++;
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        temp = nums[l];
        nums[l] = nums[i];
        nums[i] = temp;
        if (i == k) {
            System.arraycopy(nums, 0, ans, 0, k);
            return;
        } else {
            quickSort(nums, l, i - 1, k);
            quickSort(nums, i + 1, r, k);
        }
    }
}
