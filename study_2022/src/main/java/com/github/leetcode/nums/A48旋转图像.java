package com.github.leetcode.nums;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.19
 */
public class A48旋转图像 {

    public void rotate(int[][] matrix) {
        if (matrix.length == 0) return;
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length-i-1][j];
                matrix[matrix.length-i-1][j] = temp;
            }
        }
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <= i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        System.out.println("aa");
    }

    public static void main(String[] args) {
        new A48旋转图像().rotate(new int[][]{{1,2,3}, {4, 5,6}, {7, 8, 9}});
    }
}
