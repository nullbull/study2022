package com.github.back;

import com.github.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.25
 */
public class A二叉树的后续遍历 {


    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root.left);
                root = root.left;
            }
            root = stack.peek();
            if (root.right == null || root.right == pre) {
                res.add(root.val);
                pre = root;
                stack.pop();
                root = null;
            } else {
                root = root.right;
            }
        }
        return res;
    }

}
