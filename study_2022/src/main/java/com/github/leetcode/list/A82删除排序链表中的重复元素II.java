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
public class A82删除排序链表中的重复元素II {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode fake = new ListNode(-1);
        ListNode fakeGo = fake;
        ListNode go = head;
        boolean hasRepeate = false;
        while (go != null) {
            while (go.next != null && go.val == go.next.val) {
                go = go.next;
                hasRepeate = true;
            }
            if (hasRepeate) {
                go = go.next;
                hasRepeate = false;
            } else {
                fakeGo.next = go;
                fakeGo = fakeGo.next;
                go = go.next;
            }

        }
        return fake.next;
    }
}
