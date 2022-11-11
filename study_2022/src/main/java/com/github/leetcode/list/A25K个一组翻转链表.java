package com.github.leetcode.list;

import com.github.ListNode;
import java.util.ArrayList;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.11
 */
public class A25K个一组翻转链表 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode head2 = head;
        int length = 0;
        while (head != null) {
            head = head.next;
            length += 1;
        }
        head = head2;
        List<ListNode> list = new ArrayList<>();
        int curLen = 0;
        while (head != null) {
            int temp = k;
            if (length - curLen < k) {
                list.add(head);
                break;
            }
            ListNode before = null;
            while (temp > 0 && head != null) {
                ListNode next = head.next;
                head.next = before;
                before = head;
                head = next;
                temp--;
            }
            curLen += k;
            list.add(before);
        }
        ListNode virtualNode = new ListNode(-1);
        ListNode goNode = virtualNode;
        for (ListNode node : list) {
            while (node != null) {
                goNode.next = node;
                node = node.next;
                goNode = goNode.next;
            }
        }
        return virtualNode.next;
    }

    public static void main(String[] args) {
        ListNode head = ListNode.createFromArr(new int[]{1, 2, 3, 4, 5});
        new A25K个一组翻转链表().reverseKGroup(head, 2);
    }
}
