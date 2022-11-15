package com.github.offer;

import com.github.TreeNode;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.15
 */
public class A28对称的二叉树 {
    public boolean isSymmetric(TreeNode root) {
        return dfs(root.left, root.right);
    }
    public boolean dfs(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        else if (left != null && right == null) return false;
        else if (left == null ) return false;
        if (left.val != right.val) return false;
        return dfs(left.left, right.right) && dfs(left.right, right.left);
    }
}
