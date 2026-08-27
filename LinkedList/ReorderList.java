package LinkedList;

public class ReorderList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;
        ListNode first = head;

        ListNode slow = head.next;
        ListNode fast = head.next.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next = null;

        ListNode prev = null;
        while (second != null) {
            ListNode next = second.next;
            second.next = prev;
            prev = second;
            second = next;
        }

        second = prev;
        while (second != null) {
            ListNode firstNext = first.next;
            ListNode secondNext = second.next;

            ans.next = first;
            ans = ans.next;

            ans.next = second;
            ans = ans.next;

            first = firstNext;
            second = secondNext;
        }
        ans.next = first;
    }
}
