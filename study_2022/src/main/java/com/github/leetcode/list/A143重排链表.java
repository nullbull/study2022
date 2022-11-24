package com.github.leetcode.list;

import com.github.ListNode;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.20
 */
public class A143重排链表 {

    public void reorderList(ListNode head) {
        ListNode go = head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next !=  null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode slowNext = slow.next;
        slow.next = null;
        ListNode before = null;
        while (slowNext != null) {
            ListNode temp = slowNext.next;
            slowNext.next = before;
            before = slowNext;
            slowNext = temp;
        }
        while (go != null && before != null) {
            ListNode goNext = go.next;
            ListNode beforeNext = before.next;
            go.next = before;
            before.next = goNext;
            go = goNext;
            before = beforeNext;
        }
    }

}
