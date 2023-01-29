package com.github.offer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.08
 */
public class II087复原IP {


    List<String> res = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        dfs(new ArrayList<>(), s, 0);
        return res;
    }

    public void dfs(List<String> list, String s, int pos) {
        if (list.size() > 4) {
            return;
        }
        if (list.size() == 4 && pos == s.length()) {
            res.add(String.join(".", list));
            return;
        }
        for (int i = pos; i < s.length() && i < pos + 3; i++) {
            String sub = s.substring(pos, i + 1);
            if (sub.length() > 0 && Integer.parseInt(sub) <= 255) {
                if (sub.length() > 1 && sub.charAt(0) == '0') {
                    return;
                }
                list.add(sub);
                dfs(list, s, i + 1);
                list.remove(list.size() - 1);
            } else {
                return;
            }
        }
    }

}
