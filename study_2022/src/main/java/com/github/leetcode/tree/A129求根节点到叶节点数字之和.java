package com.github.leetcode.tree;

import com.github.ListNode;
import com.github.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.13
 */
public class A129求根节点到叶节点数字之和 {
    int res = 0;
    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        dfs(new ArrayList<>(), root);
        return res;
    }
    public void dfs(List<String> list, TreeNode root) {
        if (root == null) {
           return;
        }
        List<String> temp = new ArrayList<>(list);
        temp.add(root.val + "");
        if (root.left == null && root.right == null) {
            res += Integer.parseInt(temp.stream().collect(Collectors.joining()));
        } else {
            dfs(temp, root.left);
            dfs(temp, root.right);
        }
    }
}
