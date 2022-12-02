package com.github.leetcode.tree;

import com.github.TreeNode;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.28
 */
public class A1008前序遍历构造二叉搜索树 {

    public TreeNode bstFromPreorder(int[] preorder) {
        return buildTree(preorder, 0, preorder.length - 1);
    }

    public TreeNode buildTree(int[] preorder, int left, int right) {
        if (left >= right) {
            return null;
        }
        int rightStart = -1;
        for (int i = left + 1; i <= right; i++) {
            if (preorder[i] > preorder[left]) {
                rightStart = i;
                break;
            }
        }
        TreeNode root = new TreeNode(preorder[left]);
        if (rightStart != -1) {
            root.left = buildTree(preorder, left + 1, rightStart - 1);
            root.right = buildTree(preorder, rightStart, right);
        } else {
            root.left = buildTree(preorder, left + 1, right);
        }
        return root;
    }
}
