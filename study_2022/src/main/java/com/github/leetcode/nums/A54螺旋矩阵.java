package com.github.leetcode.nums;

import java.util.ArrayList;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.19
 */
public class A54螺旋矩阵 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int a = 0;
        int b = matrix.length-1;
        int c = 0;
        int d = matrix[0].length-1;
        while (true) {
            for (int i = c; i <= d; i++) list.add(matrix[a][i]);
            if (++a > b) break;
            for (int i = a; i <= b; i++) list.add(matrix[i][d]);
            if (--d < c) break;
            for (int i = d; i >= c; i--) list.add(matrix[b][i]);
            if (--b < a) break;
            for (int i = b; i >= a; i--) list.add(matrix[i][c]);
            if (++c > d) break;
        }
        return list;
    }
}
