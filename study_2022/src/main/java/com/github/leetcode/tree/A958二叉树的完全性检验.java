package com.github.leetcode.tree;

import com.github.TreeNode;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.23
 */
public class A958二叉树的完全性检验 {

    public boolean isCompleteTree(TreeNode root) {
       int total = totalCount(root);
       return dfs(root, 1, total);
    }

    public boolean dfs(TreeNode root, int current, int totalCount) {
        if (root == null) return true;
        if (current > totalCount) {
            return false;
        }
        return dfs(root.left, current * 2, totalCount) && dfs(root.right, current*2+1, totalCount);
    }

    public int totalCount(TreeNode root) {
        if (root == null) return 0;
        return totalCount(root.left) + totalCount(root.right) + 1;
    }

}
