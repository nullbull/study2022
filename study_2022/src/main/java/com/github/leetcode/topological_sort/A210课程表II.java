package com.github.leetcode.topological_sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.28
 */
public class A210课程表II {

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        if (numCourses <= 0) {
            return new int[]{0};
        }

        LinkedList<Integer> queue = new LinkedList<>();
        int[] gree = new int[numCourses];
        List<List<Integer>> list = new ArrayList<>(numCourses);
        for (int i = 0; i < numCourses; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            gree[prerequisites[i][0]]++;
            list.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        for (int i = 0; i < gree.length; i++) {
            if (gree[i] == 0) {
                queue.add(i);
            }
        }
        int[] res = new int[numCourses];
        int pos = 0;
        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            res[pos++] = poll;
            for (Integer idx : list.get(poll)) {
                gree[idx]--;
                if (gree[idx] == 0) {
                    queue.add(idx);
                }
            }
        }
        if (pos == numCourses) {
            return res;
        } else {
            return new int[]{0};
        }
    }

    public static void main(String[] args) {
        new A210课程表II().findOrder(2, new int[][]{{1, 0}});
    }
}
