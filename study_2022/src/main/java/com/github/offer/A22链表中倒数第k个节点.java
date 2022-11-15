package com.github.offer;

import com.github.ListNode;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.15
 */
public class A22链表中倒数第k个节点 {

    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) return head;
        ListNode go = head;
        int len = 0;
        while (go != null) {
            len++;
            go = go.next;
        }
        if (k > len) return head;
        ListNode slow = head;
        go = head;
        while (go != null) {
            if(k == 0) {
                slow = slow.next;
            } else {
                k--;
            }
            go = go.next;
        }
        return slow;
    }

}
