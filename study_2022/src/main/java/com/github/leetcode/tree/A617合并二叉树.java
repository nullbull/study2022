package com.github.leetcode.tree;

import com.github.TreeNode;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.14
 */
public class A617合并二叉树 {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        dfs(root1, root2);
        return root1 == null ? root2 : root1;
    }

    public TreeNode dfs(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        } else if (root1 != null && root2 == null) {
            return root1;
        } else if (root2 != null && root1 == null) {
            return root2;
        } else {
            root1.val = root1.val + root2.val;
            root1.left = dfs(root1.left, root2.left);
            root1.right = dfs(root1.right, root2.right);
            return root1;
        }
    }
}
