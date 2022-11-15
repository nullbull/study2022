package com.github.leetcode.tree;

import com.github.ListNode;
import com.github.Node;
import java.util.LinkedList;
import java.util.Stack;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.13
 */
public class A117填充每个节点的下一个右侧节点指针2 {

    Node pre = null;

    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        LinkedList<Node> stack = new LinkedList<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            Node pre = null;
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                Node cur = stack.pollFirst();
                if (cur.left != null ) stack.push(cur.left);
                if (cur.right != null) stack.push(cur.right);
                if (pre != null) {
                    pre.next = cur;
                }
                pre = cur;
            }
        }
        return root;
    }

    public void dfs(Node left, Node right) {
        if (left == null && right == null) {
            return;
        }
        if (left != null && right != null) {
            left.next = right;
            if (pre.next != null) {
                if (pre.next.left != null) {
                    left.next = pre.next.left;
                } else if (pre.next.right != null) {
                    left.next = pre.next.right;
                }
            }
        } else if (right == null) {
            if (pre.next != null) {
                if (pre.next.left != null) {
                    left.next = pre.next.left;
                } else if (pre.next.right != null) {
                    left.next = pre.next.right;
                }
            }
        } else {
            if (pre.next != null) {
                if (pre.next.left != null) {
                    right.next = pre.next.left;
                } else if (pre.next.right != null) {
                    right.next = pre.next.right;
                }
            }
        }
        if (left != null) {
            pre = left;
            dfs(left.left, left.right);
        }
        if (right != null) {
            pre = right;
            dfs(right.left, right.right);
        }
    }
}
