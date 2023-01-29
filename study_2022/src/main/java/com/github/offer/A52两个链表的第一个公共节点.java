package com.github.offer;

import com.github.ListNode;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.18
 */
public class A52两个链表的第一个公共节点 {

    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode goA = headA;
        ListNode goB = headB;
        int lenA = 0;
        int lenB = 0;
        while (goA != null) {
            lenA++;
            goA = goA.next;
        }
        while (goB != null) {
            lenB++;
            goB = goB.next;
        }
        ListNode firstGo = headA;
        ListNode secondGo = headB;
        if (lenB > lenA) {
            firstGo = headB;
            secondGo = headA;
        }
        int diff = Math.abs(lenA - lenB);
        while (firstGo != null && secondGo != null) {
            if (firstGo == secondGo) {
                return firstGo;
            } else {
                if (diff == 0) {
                    secondGo = secondGo.next;
                }
                firstGo = firstGo.next;
            }
        }
        return null;
    }
}
