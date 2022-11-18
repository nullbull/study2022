package com.github.offer;

import com.github.Node;
import java.util.Stack;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.17
 */
public class A36二叉搜索树与双向链表 {

    Node pre = null;
    Node head = null;
    public Node treeToDoublyList(Node root) {
        if (root == null) return root;
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }
//        Stack<Node> stack = new Stack<>();
//        Node head = null;
//        while (root != null || !stack.isEmpty()) {
//            while (root != null) {
//                stack.push(root);
//                pre = root;
//                root = root.left;
//            }
//            root = stack.pop();
//            if (head == null) head = root;
//            if (pre != null) {
//                if (pre.left == root) {
//                    root.right = pre;
//                } else {
//                    root.left = pre;
//                }
//            }
//            pre = root;
//            root = root.right;
//        }
//        return head;
//    }

    public void dfs(Node root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (pre != null) {
            root.right = pre;
            return;
        } else {
            head = root;
        }
        pre = root;
        root.left = pre;
        dfs(root.right);
    }
}
