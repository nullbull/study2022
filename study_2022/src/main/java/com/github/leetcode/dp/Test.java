package com.github.leetcode.dp;

import com.github.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.15
 */
public class Test {
    public void dfs(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = root;
        List<Integer> res = new ArrayList<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.peek();
            if (root.right == null || root == pre) {
                res.add(root.val);
                stack.pop();
                pre = root;
            } else {
                stack.push(root.right);
                root = root.right;
            }
        }
    }

}
