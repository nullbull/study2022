package com.github.back;

import java.util.List;

/**
 * @author niuzhenhao
 * @date 2023/3/25 22:18
 * @desc
 */
public class A139单词拆分 {

    public boolean wordBreak(String s, List<String> wordDict) {
        char[] chars = s.toCharArray();
        boolean[] dp = new boolean[chars.length+1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
