package com.github.offer;

import java.util.Arrays;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.27
 */
public class II016不含重复字符的最长子字符串 {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int[] pos = new int[26];
        Arrays.fill(pos, -1);
        char[] chars = s.toCharArray();
        int res = 1;
        int start = -1;
        for (int i = 0; i < s.length(); i++) {
            start = Math.max(pos[chars[i] - 'a'], start);
            res = Math.max(res, i - start);
            pos[chars[i]-'a'] = i;
        }
        return res;
    }
}
