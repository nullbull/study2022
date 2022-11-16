package com.github.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.16
 */
public class A17打印从1到最大的n位数 {
    List<String> res = new ArrayList<>();
    public int[] printNumbers(int n) {
        for (int i = 1; i <= n ; i++) {
            dfs(i, new StringBuilder());
        }
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = Integer.parseInt(res.get(i));
        }
        return ans;
    }
    public void dfs(int n, StringBuilder sb) {
        if (n == 0) {
            res.add(sb.toString());
            return;
        }
        for (int i = 0; i < 9; i++) {
            if (i == 0 && sb.length() == 0) continue;
            sb.append(i+"");
            dfs(n-1, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }

}
