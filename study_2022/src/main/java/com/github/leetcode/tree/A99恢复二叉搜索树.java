package com.github.leetcode.tree;

import com.github.TreeNode;
import java.util.Stack;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.11
 */
public class A99恢复二叉搜索树 {

    public void recoverTree(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode errOne = null;
        TreeNode errTwo = null;
        TreeNode pre = null;
        while (!stack.isEmpty() || root != null) {
            while (root.left != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (pre != null && pre.val >= root.val) {
                if (errOne == null) {
                    errOne = pre;
                }
                errTwo = root;
            }
            pre = root;
            root = root.right;
        }
        int temp = errOne.val;
        errOne.val = errTwo.val;
        errTwo.val = temp;
    }

}
