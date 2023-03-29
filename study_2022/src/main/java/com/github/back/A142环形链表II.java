package com.github.back;

import com.github.ListNode;

/**
 * @author niuzhenhao
 * @date 2023/3/28 23:37
 * @desc
 */
public class A142环形链表II {

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        boolean hasCycle = false;
        while (fast != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                hasCycle = true;
                break;
            }
        }
        if (hasCycle) {
            while (slow != head) {
                slow = slow.next;
                head = head.next;
            }
            return slow;
        }
        return null;
    }
}
