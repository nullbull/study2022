package com.github.leetcode.dp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.23
 */
public class A139单词拆分 {

    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length()+1];
        char[] chars = s.toCharArray();
        dp[0] = true;
        for (int i = 1; i <= chars.length; i++) {
            for (int j = 0; j < i; j++) {
                if (set.contains(s.substring(j, i)) && !dp[i]) {
                    dp[i] = dp[j];
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
//        new A139单词拆分().wordBreak("helloworld", Arrays.asList("hello", "world"));
        new A139单词拆分().wordBreak("aaaaaaa", Arrays.asList("aaaa", "aaa"));
    }
}
