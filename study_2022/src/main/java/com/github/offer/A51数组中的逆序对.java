package com.github.offer;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.17
 */
public class A51数组中的逆序对 {

    int count = 0;
    public int reversePairs(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return count;
    }



    public void mergeSort(int[] nums, int left, int right){
        if (left >= right) return;
        int mid = (left + right) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, right, mid);
    }

    public void merge(int[]nums, int left, int right, int mid) {
        int[] temp = new int [right-left+1];
        int p = 0;
        int l = left;
        int r = mid + 1;
        while (l <= mid && r <= right) {
            if (nums[l] > nums[r]) {
                count += (mid - l) + 1;
                temp[p++] = nums[r++];
            } else {
                temp[p++] = nums[l++];
            }
        }
        while (l <= mid) {
            temp[p++] =  nums[l++];
        }
        while (r <= right) {
            temp[p++] =  nums[r++];
        }
        p = 0;
        for (int i = left; i <= right; i++) {
            nums[i] = temp[p++];
        }
    }

    public static void main(String[] args) {
        new A51数组中的逆序对().reversePairs(new int[] { 7,5,6,4});
    }
}
