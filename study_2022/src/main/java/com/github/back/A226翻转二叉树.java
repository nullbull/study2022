package com.github.back;

import com.github.TreeNode;

/**
 * @author niuzhenhao
 * @date 2023/3/28 23:32
 * @desc
 */
public class A226翻转二叉树 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        TreeNode temp = left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
}
