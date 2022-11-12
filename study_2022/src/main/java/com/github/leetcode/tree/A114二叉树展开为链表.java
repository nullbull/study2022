package com.github.leetcode.tree;

import com.github.TreeNode;
import java.util.Stack;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.12
 */
public class A114二叉树展开为链表 {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        stack.push(root);
        while ( !stack.isEmpty()) {
            root = stack.pop();
            if (pre != null) {
                pre.right = root;
                pre.left = null;
            }
            pre = root;
            if (root.right != null) {
                stack.push(root.right);
            }
            if (root.left != null) {
                stack.push(root.left);
            }
        }
    }
}
