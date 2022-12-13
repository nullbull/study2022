package com.github.leetcode.dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.05
 */
public class A0401节点间通路 {

    public boolean findWhetherExistsPath(int n, int[][] graph, int start, int target) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < graph.length; i++) {
            List<Integer> list = map.getOrDefault(graph[i][0], new ArrayList<>());
            list.add(graph[i][1]);
            map.put(graph[i][0], list);
        }
        for (int i = 0; i < graph.length; i++) {
            if (graph[i][0] == start) {
                boolean[] visited = new boolean[n];
                return dfs(map, start, target, visited);
            }
        }
        return false;
    }

    public boolean dfs(Map<Integer, List<Integer>> map, int start, int target, boolean[] visited) {
        if (visited[start]) {
            return false;
        }
        List<Integer> list = map.get(start);
        if (list == null) {
            return false;
        }
        for (int path : list) {
            if (path == target) {
                return true;
            }
        }
        boolean canFind = false;
        for (int path : list) {
            canFind = dfs(map, path, target, visited);
            if (canFind) {
                return canFind;
            }
        }
        return canFind;
    }

    public static void main(String[] args) {
    }
}
