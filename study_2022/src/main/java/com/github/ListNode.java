package com.github;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode createFromArr(int[] nums) {
        ListNode head = new ListNode(-1);
        ListNode start = head;
        for (int i = 0; i < nums.length; i++ ) {
            head.next = new ListNode(nums[i]);
            head = head.next;
        }
        return start.next;
    }
}
