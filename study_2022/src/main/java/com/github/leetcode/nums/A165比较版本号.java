package com.github.leetcode.nums;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.27
 */
public class A165比较版本号 {

    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int i = 0;
        if (v1.length > v2.length) {

        }
        while (i < v1.length && i < v2.length) {
           int n1 = Integer.parseInt( v1[i]);
           int n2 = Integer.parseInt( v2[i]);
           if (n1 == n2) {
               i++;
           } else if (n1 > n2) {
               return 1;
           } else {
               return -1;
           }
        }
        if (v1.length == v2.length) {
            return 0;
        }
        else if (v1.length < v2.length) {
            for (int j = v1.length; j < v2.length; j++) {
                if (Integer.parseInt(v2[j]) > 0) {
                    return -1;
                }
            }
            return 0;
        } else {
            for (int j = v2.length; j < v1.length; j++) {
                if (Integer.parseInt(v1[j]) > 0) {
                    return -1;
                }
            }
            return 0;
        }
    }
}
