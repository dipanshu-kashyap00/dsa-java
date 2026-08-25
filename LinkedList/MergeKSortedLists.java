package LinkedList;

import java.util.PriorityQueue;

public class MergeKSortedLists {
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
    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            for (ListNode list : lists) {
                while (list != null) {
                    minHeap.add(list.val);
                    list = list.next;
                }
            }
            ListNode dummy = new ListNode(0);
            ListNode ans = dummy;
            while (!minHeap.isEmpty()) {
                ans.next = new ListNode(minHeap.remove());
                ans = ans.next;
            }
            return dummy.next;
        }
    }

}
