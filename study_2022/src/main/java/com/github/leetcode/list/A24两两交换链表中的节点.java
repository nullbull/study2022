package com.github.leetcode.list;

import com.github.ListNode;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.25
 */
public class A24两两交换链表中的节点 {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode fake = new ListNode();
        ListNode go = fake;
        while (head != null && head.next != null) {
            ListNode next = head.next.next;
            go.next = head.next;
            go = go.next;
            go.next = head;
            go = go.next;
            head = next;
        }
        if(head != null) {
            go.next = head;
            go = go.next;
        }
        go.next = null;
        return fake.next;
    }
}
