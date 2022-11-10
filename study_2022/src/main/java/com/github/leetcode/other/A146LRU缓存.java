package com.github.leetcode.other;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * this is a desc
 *
 * @author justinniu
 * @version v1.0
 * @since 2022.11.10
 */
public class A146LRU缓存 {


    public A146LRU缓存() {

    }

    private class Node {

        int key;
        int val;
        Node pre;
        Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }

        public Node() {
        }
    }

    private class LRUCache {

        private Map<Integer, Node> map;
        private Node head;
        private Node tail;
        private int capacity;
        private int size = 0;

        public LRUCache(int capacity) {
            map = new HashMap<>();
            head = new Node();
            tail = new Node();
            head.next = tail;
            tail.pre = head;
            this.capacity = capacity;
        }

        public int get(int key) {
            Node node = map.get(key);
            if (node != null) {
                moveToHead(node);
                return map.get(key).val;
            }
            return -1;
        }

        public void put(int key, int value) {
            Node node = map.get(key);
            if (node != null) {
                node.val = value;
                moveToHead(node);
            } else {
                node = new Node(key, value);
                addToHead(node);
                map.put(node.key, node);
                size++;
                if (size > capacity) {
                    Node deleteLast = deleteLast();
                    map.remove(deleteLast.key);
                }
            }
        }

        public void addToHead(Node node) {
            node.next = head.next;
            node.pre = head;
            head.next.pre = node;
            head.next = node;
        }

        public Node deleteLast() {
            size--;
            Node last = tail.pre;
            removeNode(last);
            return last;
        }

        public void moveToHead(Node node) {
            removeNode(node);
            addToHead(node);
        }

        private void removeNode(Node node) {
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }
    }

}
