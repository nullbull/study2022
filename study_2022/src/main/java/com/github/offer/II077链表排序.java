package com.github.offer;

import com.github.ListNode;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.25
 */
public class II077链表排序 {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = head;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(slow);
        return merge(left, right);
    }

    public ListNode merge(ListNode a, ListNode b) {
        ListNode fake = new ListNode(1);
        ListNode go = fake;
        while (a != null && b != null) {
            if (a.val > b.val) {
                go.next = b;
                b = b.next;
            } else {
                go.next = a;
                a = a.next;
            }
            go = go.next;
        }
        if (a != null) {
            go.next = a;
        }
        if (b != null) {
            go.next = b;
        }
        return fake.next;
    }

    public static void main(String[] args) {
        new II077链表排序().sortList(ListNode.createFromArr(new int[]{4, 2, 1, 3}));
    }

}
