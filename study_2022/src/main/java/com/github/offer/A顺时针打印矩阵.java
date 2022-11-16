package com.github.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.16
 */
public class A顺时针打印矩阵 {

    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[]{};
        int[] res = new int[matrix.length * matrix[0].length];
        int a = 0;
        int b = matrix.length-1;
        int c = 0;
        int d = matrix[0].length-1;
        List<Integer> list = new ArrayList<>();
        while (true) {
            for (int i = c; i <= d; i++) list.add(matrix[a][i]);
            if (++a > b) break;
            for (int i = a; i <= b; i++) list.add(matrix[i][d]);
            if (--d < c) break;
            for (int i = d; i >= c; i--) list.add(matrix[b][i]);
            if (a > --b) break;
            for (int i = b;  i >= a; i--) list.add(matrix[i][c]);
            if(++c > d) break;
        }
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        new A顺时针打印矩阵().spiralOrder(new int[][]{
                {1,2,3},{4,5,6},{7,8,9}
        });
    }

}
