package com.github.leetcode.tree;

import com.github.TreeNode;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.12
 */
public class A111二叉树的最小深度 {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        if (root.left != null && root.right != null) {
            return Math.min(minDepth(root.left)+1, minDepth(root.right)+1);
        } else if (root.right != null) {
            return  minDepth(root.right) + 1;
        } else {
            return minDepth(root.left) + 1;
        }
    }
}
