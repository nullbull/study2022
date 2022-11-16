package com.github.offer;

import com.github.Node;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.16
 */
public class A35复杂链表的复制 {
    public Node copyRandomList(Node head) {
        Node go = head;
        while (go != null) {
            Node temp = new Node(go.val);
            temp.next = go.next;
            go.next = temp;
            go = go.next.next;
        }
        go = head;
        Node copy = new Node(-1);
        Node copyGo = copy;
        while (go != null) {
            if (go.random != null) {
                go.next.random = go.random.next;
            }
            go = go.next.next;
        }
        go = head;
        while (go != null) {
            copyGo.next = go.next;
            copyGo = copyGo.next;
            go.next = go.next.next;
            go = go.next;
        }
        return copy.next;
    }
}
