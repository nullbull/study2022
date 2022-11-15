package com.github.offer;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.14
 */
public class A04二维数组中的查找 {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length == 0) return false;
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0, j = m - 1;
        while (i  < n && j > 0) {
            if (matrix[i][j] == target) return true;
            if (matrix[i][j] > target) j--;
            if (matrix[i][j] < target) i++;
        }
        return false;
    }

}
