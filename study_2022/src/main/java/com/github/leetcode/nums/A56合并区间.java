package com.github.leetcode.nums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.20
 */
public class A56合并区间 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        int i = 0;
        int count = 0;
        List<int[]> list = new ArrayList<>();
        while ( i < intervals.length) {
            int j = i + 1;
            int right = intervals[i][1];
            while (j < intervals.length && intervals[j][0] <= right) {
                right = Math.max(right, intervals[j][1]);
            }
            list.add(new int[]{intervals[i][0], right});
            i = j;
        }
        int[][] res = new int[list.size()][2];
        for (int k = 0; k < list.size(); k++ ) {
            res[k] = list.get(k);
        }
        return res;
    }
}
