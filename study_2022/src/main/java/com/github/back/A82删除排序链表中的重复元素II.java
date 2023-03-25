package com.github.back;

import com.github.ListNode;

/**
 * @author niuzhenhao
 * @date 2023/3/25 15:42
 * @desc
 */
public class A82删除排序链表中的重复元素II {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode fake = new ListNode();
        ListNode go = fake;

        while (head != null) {
            boolean hasRepeat = false;
            while (head.next != null && head.next.val == head.val) {
                head = head.next;
                hasRepeat = true;
            }
            if (hasRepeat) {
                head = head.next;
            }
            if (!hasRepeat) {
                go.next = head;
                head = head.next;
                go = go.next;
            }
        }
        go.next = null;
        return fake.next;
    }
}
