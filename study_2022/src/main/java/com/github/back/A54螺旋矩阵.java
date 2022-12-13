package com.github.back;

import java.util.ArrayList;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.03
 */
public class A54螺旋矩阵 {


    public List<Integer> spiralOrder(int[][] nums) {

        int a = 0;
        int b = nums.length-1;
        int c = 0;
        int d = nums[0].length-1;
        List<Integer> res = new ArrayList<>();
        while (true) {
            for (int i = c; i <= d; i++) res.add(nums[a][i]);
            if (++a > b) break;
            for (int i = a; i <= b; i++) res.add(nums[i][d]);
            if (--d < c) break;
            for (int i = d; i >= c; i--) res.add(nums[b][i]);
            if (--b < a) break;
            for (int i = b; i >= a; i--) res.add(nums[i][c]);
            if (++c > d) break;
        }
        return res;
    }

}
