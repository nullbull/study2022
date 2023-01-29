package com.github.back;

import com.github.ListNode;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.26
 */
public class A148排序链表 {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = slow;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(slow);
        ListNode fake = new ListNode(-1);
        ListNode go = fake;
        while (left != null && right != null) {
            if (left.val > right.val) {
                go.next = right;
                right = right.next;
            } else {
                go.next = left;
                left = left.next;
            }
            go = go.next;
        }
        if (left != null) {
            go.next = left;
        }
        if (right != null) {
            go.next = right;
        }
        return fake.next;
    }

}
