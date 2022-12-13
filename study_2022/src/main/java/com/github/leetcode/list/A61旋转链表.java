package com.github.leetcode.list;

import com.github.ListNode;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.11
 */
public class A61旋转链表 {


    public ListNode rotateRight(ListNode head, int k) {
        ListNode go = head;
        int len = 0;
        while (go != null) {
            go = go.next;
            len++;
        }
        int val = k % len;
        k = val == 0 ? len : val;
        go = head;
        ListNode second = head;
        ListNode beforeSecond = head;
        ListNode lastNode = head;
        while (go != null) {
            lastNode = go;
            go = go.next;
            if (k == 0) {
                beforeSecond = second;
                second = second.next;
            } else {
                k--;
            }
        }
//        ListNode next = second.next;
//        second.next = null;
//        ListNode next = second;
        beforeSecond.next = null;
        lastNode.next = head;
//        while (next != null) {
//            ListNode temp = next.next;
//            next.next = before;
//            before = next;
//            next = temp;
//        }
        return second;
    }

}
