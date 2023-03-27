package com.github.back;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author niuzhenhao
 * @date 2023/3/26 22:50
 * @desc
 */
public class A93复原IP地址 {


    private List<String> res = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        dfs(new ArrayList<>(), s, 0);
        return res;
    }

    public void dfs(List<String> list, String s, int pos) {
        if (list.size() == 4 && pos == s.length()) {
            res.add(list.stream().collect(Collectors.joining(".")));
            return;
        }
        for (int i = pos; i < s.length() && i < pos + 3; i++) {
            String sb = s.substring(pos, i);
            int val = Integer.parseInt(sb);
            if (val >= 0 && val <= 255) {
                if (sb.length() > 1 && sb.charAt(0) == '0') {
                    return;
                }
                list.add(sb);
                dfs(list, s, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }
}
