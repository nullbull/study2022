package com.github.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.25
 */
public class II0110和1个数相同的子数组 {

//    public int findMaxLength(int[] nums) {
//        int[] sum = new int[nums.length];
//        sum[0] = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            sum[i] = sum[i-1] + nums[i];
//        }
//        int len = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i; j < nums.length; j++) {
//                if ((j - i + 1) % 2 != 0 ) continue;
//                if (sum[j] - sum[i] + nums[i] == (j - i + 1) / 2) {
//                    len = Math.max(len, j - i + 1);
//                }
//            }
//        }
//        return len;
//    }

    public int findMaxLength(int[] nums) {
        int res = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0) nums[i] = -1;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == 0) {
                res = Math.max(res, i + 1);
            }
            if (map.containsKey(sum)) {
                res = Math.max(res, i - map.get(sum) + 1);
            }
            map.put(sum, i);
        }
        return res;
    }

    public static void main(String[] args) {
        new II0110和1个数相同的子数组().findMaxLength(new int[]{0,1,1,0});
    }
}
