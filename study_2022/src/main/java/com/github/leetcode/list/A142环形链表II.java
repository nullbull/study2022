package com.github.leetcode.list;

import com.github.ListNode;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.23
 */
public class A142环形链表II {

    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }
        if (hasCycle) {
            ListNode go = head;
            while (go != slow) {
                go = go.next;
                slow = slow.next;
            }
            return go;
        }
        return null;
    }

}
