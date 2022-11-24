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
public class A148排序链表 {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(temp);
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
        go.next = left != null ? left : right;
        return fake.next;
    }
}
