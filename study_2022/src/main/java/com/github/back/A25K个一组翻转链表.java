package com.github.back;

import com.github.ListNode;
import java.util.ArrayList;
import java.util.List;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.12.27
 */
public class A25K个一组翻转链表 {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode go = head;
        int len = 0;
        while (go != null) {
            len++;
            go = go.next;
        }
        if (len < k) {
            return head;
        }
        int current  = 0;
        int time = 0;
        List<ListNode> list = new ArrayList<>();
        ListNode before = null;
        go = head;
        while (go != null) {
            if (current + k > len) {
                list.add(go);
                break;
            }
            ListNode temp = go.next;
            go.next = before;
            before = go;
            time++;
            if (time == k) {
                list.add(go);
                before = null;
                time = 0;
                current += k;
            }
            go = temp;
        }
        ListNode fake = new ListNode(-1);
        go = fake;
        for (ListNode node : list) {
            while (node != null) {
                go.next = node;
                go = go.next;
                node = node.next;
            }
        }
        return fake.next;
    }

    public static void main(String[] args) {
        new A25K个一组翻转链表().reverseKGroup(ListNode.createFromArr(new int[]{1,2,3,4,5}), 2);
    }
}
