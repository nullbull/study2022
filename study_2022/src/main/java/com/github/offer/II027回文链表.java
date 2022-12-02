package com.github.offer;

import com.github.ListNode;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.30
 */
public class II027回文链表 {

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = head;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        ListNode reverse = reverse(slow);
        while (reverse != null && head != null) {
            if (reverse.val != head.val) {
                return false;
            }
        }
        return true;
    }

    public ListNode reverse(ListNode root) {
        ListNode before = null;
        while (root != null) {
            ListNode temp = root.next;
            root.next = before;
            before = root;
            root = temp;
        }
        return before;
    }
}
