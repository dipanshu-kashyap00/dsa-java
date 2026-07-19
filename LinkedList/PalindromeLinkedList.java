package LinkedList;

import java.util.Stack;

public class PalindromeLinkedList {

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

    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            st.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) {
            st.push(slow.val);
        }
        while (slow != null && !st.isEmpty()) {
            if (slow.val != st.pop()) {
                return false;
            }
            slow = slow.next;
        }
        return true && st.isEmpty();
    }

}
