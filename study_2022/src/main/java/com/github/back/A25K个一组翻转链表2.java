package com.github.back;

import com.github.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author niuzhenhao
 * @date 2023/3/25 17:01
 * @desc
 */
public class A25K个一组翻转链表2 {

    public ListNode reverseKGroup(ListNode head, int k) {
        List<ListNode> list = new ArrayList<>();
        ListNode go = head;
        int len = 0;
        while (go != null) {
            len++;
            go = go.next;
        }
        go = head;
        ListNode before = null;
        int count = 0;
        int total = 0;
        while (go != null) {
            ListNode next = go.next;
            if (len - total < k) {
                list.add(go);
                break;
            }
            go.next = before;
            before = go;
            count++;
            if (count == k) {
                count = 0;
                list.add(go);
                before = null;
                total += k;
            }
            go = next;
        }
        ListNode fake = new ListNode();
        ListNode fakeGo = fake;
        for (ListNode l : list) {
            while (l != null) {
                fakeGo.next = l;
                l = l.next;
                fakeGo = fakeGo.next;
            }
        }
        return fake.next;
    }
}
