package com.github.leetcode.tree;

import com.github.TreeNode;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.12
 */
public class A437路径总和III {

    int count = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return count;
        }
        dfs(root, targetSum);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        return count;
    }

    public void dfs(TreeNode root, long target) {
        if (root == null) {
            return;
        }
        if (root.val == target) {
            count++;
        }
        dfs(root.left, target - root.val);
        dfs(root.right, target - root.val);
    }
}
