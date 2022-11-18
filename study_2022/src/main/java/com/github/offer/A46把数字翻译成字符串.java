package com.github.offer;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.17
 */
public class A46把数字翻译成字符串 {

    public int translateNum(int num) {
        String s = num + "";
        int[] dp = new int[s.length()+1];
        dp[0] = 1;
        dp[1] = 1;
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            String temp = chars[i-1] + "" + chars[i];
            int val = Integer.parseInt(temp);
            if (val >= 10 && val <= 25) {
                dp[i+1] = dp[i] + dp[i];
            } else {
                dp[i+1] = dp[i];
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        new A46把数字翻译成字符串().translateNum(25);
    }

}
