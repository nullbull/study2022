package com.github.leetcode.other;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.14
 */
public class A200岛屿数量 {
    public int numIslands(char[][] grid) {
        int count = 0;
        if (grid.length == 0) return 0;
        for (int i = 0; i < grid.length; i++ ) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(char[][]grid, int i, int j) {
        if (!isOverSize(grid, i, j)) return;
        if (grid[i][j] != '1') return;
        grid[i][j] = '0';
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i , j - 1);
        dfs(grid, i , j + 1);
    }
    public boolean isOverSize(char[][]grid, int i, int j) {
        return i >= 0 && i < grid.length && j >= 0 && grid[0].length > j;
    }

}
