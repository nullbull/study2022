package com.github.offer;

import com.github.TreeNode;

public class II053二叉搜索树中的中序后继 {

    TreeNode pre = null;
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        dfs(root, p);
        return pre;
    }

    public void dfs(TreeNode root, TreeNode p) {
        if (root == null) return;
        dfs(root.left, p);
        if (pre == null && root.val > p.val) {
            pre = root;
        }
        dfs(root.right, p);
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(1);
        TreeNode c = new TreeNode(3);
        a.left = b;
        a.right = c;
        TreeNode node = new II053二叉搜索树中的中序后继().inorderSuccessor(a, b);
        System.out.println(node);
    }
}
