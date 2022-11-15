package com.github.leetcode.tree;

import com.github.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.13
 */
public class A145二叉树的后序遍历 {
//    List<Integer> res = new ArrayList<>();
//    public List<Integer> postorderTraversal(TreeNode root) {
//        dfs(root);
//        return res;
//    }
//
//    public void dfs(TreeNode root) {
//        if (root == null) return;
//        dfs(root.left);
//        dfs(root.right);
//        res.add(root.val);
//    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if ( root == null) return res;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.peek();
            if (root.right == null || root.right == pre) {
                res.add(root.val);
                stack.pop();
                pre = root;
                root = null;
            } else {
               root = root.right;
            }
        }
        return res;
    }
}
