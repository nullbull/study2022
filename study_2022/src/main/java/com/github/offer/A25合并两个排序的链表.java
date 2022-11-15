package com.github.offer;

import com.github.ListNode;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.15
 */
public class A25合并两个排序的链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode go = head;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                go.next = l2;
                l2 = l2.next;
            } else  {
                go.next = l1;
                l1 = l1.next;
            }
            go = go.next;
        }
        if (l1 != null) {
            go.next = l1;
        }
        if (l2 != null) {
            go.next = l2;
        }
        return head.next;
    }
}
