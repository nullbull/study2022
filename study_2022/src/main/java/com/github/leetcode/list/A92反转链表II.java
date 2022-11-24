package com.github.leetcode.list;

import com.github.ListNode;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.21
 */
public class A92反转链表II {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode fake = new ListNode(-1);
        ListNode go = fake;
        go.next = head;
        ListNode p = go;
        ListNode q = go.next;
        for (int i = 1; i < left; i++) {
            p = p.next;
            q = q.next;
        }
        ListNode tempQ = q;
        ListNode before = null;
        for (int i = 0; i <= right - left; i++) {
            ListNode temp = q.next;
            q.next = before;
            before = q;
            q = temp;
        }
        p.next =  before;
        tempQ.next = q;
        return fake.next;
    }

    public static void main(String[] args) {
//        new A92反转链表II().reverseBetween(ListNode.createFromArr(new int[]{1,2,3,4,5}), 2, 4);
        new A92反转链表II().reverseBetween(ListNode.createFromArr(new int[]{3,5}), 1, 2);
    }
}
