package com.github.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.27
 */
public class II074合并区间 {

    public int[][] merge(int[][] nums) {
        Arrays.sort(nums, (a, b) -> a[0] - b[0]);
        int len = nums.length;
        int i = 0;
        List<int[]> list = new ArrayList<>();
        while (i < nums.length) {
            int j = i + 1;
            int end = nums[i][1];
            while (j < nums.length && nums[j][0] <= end) {
                if (end < nums[j][1]) {
                    end = nums[j][1];
                }
                j++;
            }
            list.add(new int[]{nums[i][0], end});
            i = j;
        }
        int[][] res = new int[list.size()][2];
        for (int j = 0; j < list.size(); j++) {
            res[j] = list.get(j);
        }
        return res;
    }
}
