package com.github.leetcode.string;

/**
 * @author niuzhenhao
 * @date 2023/3/25 16:26
 * @desc
 */
public class A43字符串相乘 {

    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] res = new int[m+n+1];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                res[i+j+1] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }
        int last = 0;
        for (int i = m + n - 1; i >= 1; i--) {
            res[i-1] += res[i] / 10;
            res[i] = res[i] % 10;
        }
        StringBuilder sb = new StringBuilder();
        int start = res[0] == 0 ? 1 : 0;
        for (int i = start; i < (m + n); i++) {
            sb.append(res[i] + "");
        }
        if(sb.charAt(0) == '0') {
            return "0";
        }
        return sb.toString();
    }


}
