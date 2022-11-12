package com.github.leetcode.tree;

import com.github.ListNode;
import com.github.TreeNode;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.12
 */
public class A109有序链表转换二叉搜索树 {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode go = head;
        int len = 0;
        while (go != null) {
            go = go.next;
            len++;
        }
        go = head;
        int mid = len / 2;
        int temp = 0;
        ListNode leftStart = new ListNode();
        ListNode leftStartGo = leftStart;
        while (temp < mid) {
            temp ++;
            leftStartGo.next = go;
            leftStartGo = leftStartGo.next;
            go = go.next;
        }
        TreeNode root = new TreeNode(go.val);
        root.left = sortedListToBST(leftStart.next);
        root.right = sortedListToBST(go.next);
        return root;
    }
}
