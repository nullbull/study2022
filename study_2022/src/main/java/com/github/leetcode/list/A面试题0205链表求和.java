package com.github.leetcode.list;

import com.github.ListNode;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.27
 */
public class A面试题0205链表求和 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode go = head;
        int last = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + last;
            last = sum / 10;
            sum = sum % 10;
            go.next = new ListNode(sum);
            go = go.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int sum = l1.val  + last;
            last = sum / 10;
            sum = sum % 10;
            go.next = new ListNode(sum);
            go = go.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int sum = l2.val  + last;
            last = sum / 10;
            sum = sum % 10;
            go.next = new ListNode(sum);
            go = go.next;
            l2 = l2.next;
        }
        if (last > 0) {
            go.next = new ListNode(last);
        }
        return head.next;
    }
}
