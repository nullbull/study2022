package com.github.back;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.26
 */
public class A56合并区间 {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int i = 0;
        List<int[]> list = new ArrayList<>();
        while (i < intervals.length) {
            int j = i + 1;
            int last = intervals[i][1];
            while (j < intervals.length && last >= intervals[j][0]) {
                last = Math.max(intervals[j][1], last);
                j++;
            }
            list.add(new int[]{intervals[i][0], last});
            i = j;
        }
        int[][] res = new int[list.size()][2];
        for (int j = 0; j < intervals.length; j++) {
            res[j] = list.get(j);
        }
        return res;
    }
}
