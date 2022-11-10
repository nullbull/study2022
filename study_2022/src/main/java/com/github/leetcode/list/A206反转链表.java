package com.github.leetcode.list;
import com.github.ListNode;
/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.10
 */
public class A206反转链表 {
    public ListNode reverseList(ListNode head) {
        ListNode before = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = before;
            before = head;
            head = temp;
        }
        return before;
    }

    public static void main(String[] args) {
      new A206反转链表().reverseList(ListNode.createFromArr(new int[]{1,2,3,4,5}));

    }


}
