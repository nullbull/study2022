package com.github.leetcode.tree;

import com.github.Node;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.13
 */
public class A116填充每个节点的下一个右侧节点指针 {

    Node pre = null;

    public Node connect(Node root) {
        if (root == null) return root;
        pre = root;
        dfs(root.left, root.right);
        return root;
    }

    public void dfs(Node left, Node right) {
        if (left == null && right == null) {
            return;
        }
        left.next = right;
        if (pre.next != null) {
            right.next = pre.next.left;
        }
        pre = left;
        dfs(left.left, left.right);
        pre = right;
        dfs(right.left, right.right);
    }

}
