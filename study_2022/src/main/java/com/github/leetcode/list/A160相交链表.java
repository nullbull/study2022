package com.github.leetcode.list;

import com.github.ListNode;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.12
 */
public class A160相交链表 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode goA = headA;
        ListNode goB = headB;
        int lenA = 0;
        int lenB = 0;
        while (goA != null) {
            goA = goA.next;
            lenA++;
        }
        while (goB != null) {
            goB = goB.next;
            lenB++;
        }
        if (lenB < lenA) {
            goA = headB;
            headB = headA;
            headA = goA;
        }
        int v = Math.abs(lenA - lenB);
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            if (v == 0) {
                headA = headA.next;
            } else {
                v--;
            }
            headB = headB.next;
        }
        return null;
    }

}
