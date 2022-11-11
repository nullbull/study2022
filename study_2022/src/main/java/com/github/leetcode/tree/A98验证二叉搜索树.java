package com.github.leetcode.tree;

import com.github.TreeNode;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.11
 */
public class A98验证二叉搜索树 {
    long pre = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (isValidBST(root.left)) {
            return false;
        }
        if (root.val <= pre) {
            return false;
        }
        pre = root.val;
        return isValidBST(root.right);
    }

    public void dfs(int max, TreeNode root) {

    }
}
