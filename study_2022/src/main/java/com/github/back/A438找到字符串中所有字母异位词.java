package com.github.back;

import com.github.ListNode;
import java.util.ArrayList;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.02
 */
public class A438找到字符串中所有字母异位词 {

    public List<Integer> findAnagrams(String s, String p) {
        char[] sChars = s.toCharArray();
        char[] pChars = p.toCharArray();
        int[] count = new int[128];
        for (char c : pChars) {
            count[c] += 1;
        }
        int l = 0;
        int r = 0;
        List<Integer> res = new ArrayList<>();
        while (r < s.length()) {
            if (r - l + 1 == p.length()) {
                int[] temp = new int[128];
                System.arraycopy(count, 0, temp, 0, 128);
                int emptyCount = 0;
                for (int i = l; i <= r; i++) {
                    temp[sChars[i]]--;
                }
                for (int i = 0; i < pChars.length; i++) {
                    if (temp[pChars[i]] == 0) {
                        emptyCount++;
                    }
                }
                if (emptyCount == p.length()) {
                    res.add(l);
                }
            }
            if (r - l + 1 >= p.length()) {
                l++;
            } else {
                r++;
            }

        }
        return res;
    }

    public static void main(String[] args) {
//        new A438找到字符串中所有字母异位词().findAnagrams("cbaabcefg", "abc");
//        new A438找到字符串中所有字母异位词().findAnagrams("abaabcefg", "ab");
        new A438找到字符串中所有字母异位词().findAnagrams("baa", "aa");
    }


}
