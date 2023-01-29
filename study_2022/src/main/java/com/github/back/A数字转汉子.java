package com.github.back;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2023.01.06
 */
public class A数字转汉子 {

    public static void main(String[] ags) {
        String[] shu = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
        String[] zi = {"", "十", "百", "千", "万", "十", "百", "千", "亿", "十", "百", "千", "万亿"};

        String result = "10000024";
        char[] b = result.toCharArray();
        String answer = "";
        int i, j, k = 0;
        int length = b.length;
        for (i = 0; i < length; i++) {
            j = (int) b[i] - 48;
            if (j != 0) {
                answer += shu[j] + zi[length - i - 1];//length-i-1:length-1因为数组第一个元素为0
            } else {
                if (i == length - 1) {
                } else {
                    if ((length - i - 1 > 3) && (length - i - 1 < 8)) {
                        k++;
                    }
                    if (b[i + 1] != '0' && ((length - i - 1) == 4 || (length - i - 1) == 8) && k != 4) {
                        answer += zi[length - i - 1];

                    } else if (b[i + 1] != '0') {
                        answer += shu[j];
                    }
                }
            }
        }
        System.out.println(answer);

    }

}
