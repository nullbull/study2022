package com.github.leetcode.other;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.20
 */
public class A349两个数组的交集 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet = new HashSet<>();
        if (nums1.length < nums2.length) {
            return intersection(nums2, nums1);
        }
        for (int v : nums1) {
            hashSet.add(v);
        }
        HashSet<Integer> res = new HashSet<>();
        for (int v : nums2) {
            if (hashSet.contains(v)) res.add(v);
        }
        int[] nums = new int[res.size()];
        Iterator<Integer> iterator = res.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            nums[i++] = iterator.next();
        }
        return nums;
    }
}
