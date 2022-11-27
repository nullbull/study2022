package com.github.leetcode.windows;

import java.util.ArrayList;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.26
 */
public class A438找到字符串中所有字母异位词 {

    public List<Integer> findAnagrams(String s, String p) {
        char[] chars = p.toCharArray();
        int[] arr = new int[26];
        for (int i = 0; i < chars.length; i++) {
            arr[chars[i]- 'a'] += 1;
        }
        int start = 0;
        int end = -1;
        List<Integer> res = new ArrayList<>();
        while (start < s.length()) {
            if (end + 1 < s.length() && end - start + 1 < p.length()) {
                end++;
            } else {
                start++;
            }
            if (end - start  + 1 == p.length()) {
                int[] copy = new int[26];
                System.arraycopy(arr, 0, copy, 0, arr.length);
                String substring = s.substring(start, end + 1);
                for (char a : substring.toCharArray()) {
                    copy[a-'a'] -= 1;
                }
                boolean ok = true;
                for (int num : copy) {
                    if (num != 0) {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    res.add(start);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
//        new A438找到字符串中所有字母异位词().findAnagrams("cbaebabacd", "abc");
        new A438找到字符串中所有字母异位词().findAnagrams("abab", "ab");
    }

}
