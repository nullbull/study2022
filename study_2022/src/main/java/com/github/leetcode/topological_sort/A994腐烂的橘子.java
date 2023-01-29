package com.github.leetcode.topological_sort;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2023.01.04
 */
public class A994腐烂的橘子 {

    public int orangesRotting(int[][] grid) {
        LinkedList<String> queue = new LinkedList<>();
        int freshCount = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    queue.add(i + "," + j);
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }
        if (freshCount == 0) {
            return 0;
        }
        int time = -1;
        while (freshCount > 0 && !queue.isEmpty()) {
            time++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String poll = queue.poll();
                String[] split = poll.split(",");
                int l = Integer.parseInt(split[0]);
                int r = Integer.parseInt(split[1]);
                if (l-1 >= 0 && grid[l-1][r] == 1) {
                    queue.add((l-1) + "," + r);
                    grid[l-1][r] = 2;
                    freshCount--;
                }
                if (l+1 < grid.length  && grid[l+1][r] == 1) {
                    queue.add((l+1) + "," + r);
                    grid[l+1][r] = 2;
                    freshCount--;
                }
                if (r -1 >= 0  && grid[l][r-1] == 1) {
                    queue.add(l + "," + (r-1));
                    grid[l][r-1] = 2;
                    freshCount--;
                }
                if (r + 1 < grid[0].length  && grid[l][r+1] == 1) {
                    queue.add(l + "," + (r+1));
                    grid[l][r+1] = 2;
                    freshCount--;
                }
            }
        }
        return freshCount > 0 ? - 1 : time;
    }
}
