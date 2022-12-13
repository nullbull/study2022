package com.github.back;

import com.github.ListNode;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.11
 */
public class A24两两交换链表中的节点 {

    public ListNode swapPairs(ListNode head) {
        ListNode fake = new ListNode();
        ListNode go = fake;

        while (head != null && head.next != null) {
            ListNode temp = head.next.next;
            go.next = head.next;
            go = go.next;
            go.next = head;
            go = go.next;
            head = temp;
        }
        go.next = head;
        return fake.next;
    }

}
