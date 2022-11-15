package com.github.leetcode.tree;

import com.github.TreeNode;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.13
 */
public class A124二叉树中的最大路径和 {

    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return res;
    }

    public int dfs(TreeNode root) {
        if (root == null) return 0;
        int left = Math.max(dfs(root.left), 0);
        int right = Math.max(dfs(root.right), 0);
        res= Math.max(res, left + right + root.val);
        return Math.max(left , right) + root.val;
    }
}
