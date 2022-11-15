package com.github.leetcode.tree;

import com.github.TreeNode;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.13
 */
public class A222完全二叉树的个数 {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = 0;
        int rightDepth = 0;
        TreeNode left = root.left;
        TreeNode right = root.right;
        while (left != null) {
            leftDepth++;
            left = left.left;
        }
        while (right != null) {
            rightDepth++;
            right = right.right;
        }
        if (rightDepth == leftDepth) {
            return 2 << leftDepth  - 1;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

}
