package com.github.back;

import com.github.ListNode;

/**
 * @author niuzhenhao
 * @date 2023/3/28 22:39
 * @desc
 */
public class A143重排链表 {

    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode before = null;
        ListNode slowNext = slow.next;
        slow.next = null;
        while (slowNext != null) {
            ListNode next = slowNext.next;
            slowNext.next = before;
            before = slowNext;
            slowNext = next;
        }
        ListNode fake = new ListNode();
        ListNode go = fake;
        while (head != null && before != null) {
            ListNode next = head.next;
            ListNode beforeNext = before.next;
            head.next = before;
            before.next = next;
            head = next;
            before = beforeNext;
        }
    }
}
