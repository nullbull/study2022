package com.github.offer;

import com.github.ListNode;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.16
 */
public class A18删除链表中的节点 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode before = null;
        ListNode go = head;
        while (go != null) {
            if (go.val == val) {
                if (before != null) before.next = go.next;
                else head = go.next;
                break;
            }
            before = go;
            go = go.next;
        }
        return head;
    }
}
