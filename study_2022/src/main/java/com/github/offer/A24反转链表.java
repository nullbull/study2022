package com.github.offer;

import com.github.ListNode;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.16
 */
public class A24反转链表 {

    public ListNode reverseList(ListNode head) {
        ListNode before = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = before;
            before = head;
            head = temp;
        }
        return before;
    }
}
