package com.github.leetcode.dfs;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.25
 */
public class A547省份数量 {


    public int findCircleNum(int[][] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] == 1)  {
                    dfs(nums, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(int[][] nums, int l, int r) {
        if (!(l >= 0 && l < nums.length && r >= 0 && r < nums[0].length)) {
            return;
        }
        if (nums[l][r] == 0) return;
        if (nums[l][r] == 1) {
            nums[l][r] = 0;
            dfs(nums, r, l);
            for (int i = 0; i < nums[0].length; i++) {
                dfs(nums, l, i);
            }
        }
    }

    public static void main(String[] args) {

        new A547省份数量().findCircleNum(new int[][]{{1,0,0,1}, {0,1,1,0}, {0,1,1,1}, {1,0,1,1}});
    }

}
