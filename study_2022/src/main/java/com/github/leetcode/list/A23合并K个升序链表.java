package com.github.leetcode.list;

import com.github.ListNode;
import java.util.PriorityQueue;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.19
 */
public class A23合并K个升序链表 {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode node : lists) {
            if (node == null) continue;
            queue.offer(node);
        }
        ListNode head = new ListNode(-1);
        ListNode go = head;
        while (!queue.isEmpty()) {
            go.next = queue.poll();
            go = go.next;
            if (go.next != null ) {
                queue.offer(go.next);
            }
        }
        return head.next;
    }

}
