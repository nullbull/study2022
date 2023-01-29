package com.github.leetcode.string;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.26
 */
public class A415字符串相加 {

    public String addStrings(String num1, String num2) {
        if (num1.length() > num2.length()) {
            return addStrings(num2, num1);
        }
        int left = 0;
        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();
        StringBuilder sb = new StringBuilder();
        int l = chars1.length - 1;
        int r = chars2.length - 1;
        while (l >= 0 && r >= 0) {
            int sum = chars1[l] + chars2[r] - '0' - '0' + left;
            left = sum / 10;
            sum = sum % 10;
            sb.append(sum);
            l--;
            r--;
        }
        while (r >= 0) {
            int sum = chars2[r] - '0' + left;
            left = sum / 10;
            sum = sum % 10;
            sb.append(sum);
            r--;
        }
        if (left > 0) {
            sb.append(left);
        }
        return sb.reverse().toString();
    }
}
