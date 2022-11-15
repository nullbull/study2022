package com.github.leetcode.tree;

import com.github.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.14
 */
public class A230二叉搜索树中第K小的元素 {

    int res = 0;
    int wantPos = 0;
    public int kthSmallest(TreeNode root, int k) {
        wantPos = k;
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        return res;
    }

    public void dfs(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        dfs(root, list);
        list.add(root.val);
        if (list.size() == wantPos) {
            res = root.val;
            return;
        }
        dfs(root.right, list);
    }

}
