package com.github.offer;

import com.github.TreeNode;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.15
 */
public class A27二叉树的镜像 {

    public TreeNode mirrorTree(TreeNode root) {
        dfs(root);
        return root;
    }
    public void dfs(TreeNode root) {
        if (root == null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        dfs(root.left);
        dfs(root.right);
    }

}
