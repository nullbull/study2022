package com.github.leetcode.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.04
 */
public class A1481不同整数的最少数目 {

    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int v : arr) {
            Integer orDefault = map.getOrDefault(v, 0);
            map.put(v, orDefault + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a, b) -> a.getValue() - b.getValue());
        int count = 0;
        for (Map.Entry<Integer, Integer> v : list) {
            if (k >= v.getValue()) {
                k = k - v.getValue();
                v.setValue(0);
            } else {
                v.setValue(v.getValue() - k);
                k = 0;
            }
            if (v.getValue() > 0) {
                count++;
            }
        }
        return count;
    }

}
