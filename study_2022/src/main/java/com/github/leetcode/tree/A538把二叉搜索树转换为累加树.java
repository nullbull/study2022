package com.github.leetcode.tree;

import com.github.TreeNode;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.14
 */
public class A538把二叉搜索树转换为累加树 {
    int current = 0;
    public TreeNode convertBST(TreeNode root) {
        dfs(root);
        return root;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        convertBST(root.right);
        root.val = root.val + current;
        current = root.val;
        convertBST(root.left);
    }
}
