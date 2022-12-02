package com.github.leetcode.list;

import com.github.ListNode;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.30
 */
public class A445两数相加II {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int left = 0;
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode res = new ListNode();
        ListNode go = res;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + left;
            go.next = new ListNode( sum % 10 );
            left = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
            go = go.next;
        }
        while (l1 != null) {
            int sum = l1.val + left;
            go.next = new ListNode( sum % 10 );
            l1 = l1.next;
            go = go.next;
        }
        while (l2 != null) {
            int sum = l2.val + left;
            go.next = new ListNode( sum % 10 );
            l2 = l2.next;
            go = go.next;
        }
        if (left > 0) {
            go.next = new ListNode(left);
            go = go.next;
        }
        return reverse(res.next);
    }

    public ListNode reverse(ListNode root) {
        ListNode before = null;
        while (root != null) {
            ListNode temp = root.next;
            root.next = before;
            before = root;
            root = temp;
        }
        return before;
    }
}
