package com.github.leetcode.list;

import com.github.ListNode;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.12
 */
public class A21合并两个有序链表 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode go = head;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                go.next = list2;
                list2 = list2.next;
            }else {
                go.next = list1;
                list1 = list1.next;
            }
            go = go.next;
        }
        if (list1 != null) go.next = list1;
        if (list2 != null) go.next = list2;
        return head.next;
    }

}
