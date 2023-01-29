package com.github.back;

import com.github.ListNode;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.30
 */
public class A61旋转链表 {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode go = head;
        int len = 0;
        while (go != null) {
            go = go.next;
            len++;
        }
        if(len == 0 || k == 0) return head;
        if (len % k == 0) return
                go = head;
        int count = len - ( k % len);
        for (int i = 0; i < count-1; i++) {
            go = go.next;
        }
        ListNode newHead = go.next;
        go.next = null;
        ListNode res = newHead;
        while (newHead.next != null) {
            newHead = newHead.next;
        }
        newHead.next = head;
        return res;
    }
}
