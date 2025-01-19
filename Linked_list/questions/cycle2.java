/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;                   // exception handling.
        if(head.next == null) return null;              // exception handling.
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null){
            if(slow == null) return null;               // exception handling.
            slow = slow.next;
            if(fast.next == null) return null;          // exception handling.
            fast = fast.next.next;

            if(slow == fast) break;
        }
        ListNode temp = head;

        while(temp != slow){
            temp = temp.next;
            if(slow == null) return null;          // exception handling
            slow = slow.next;
        }

        return slow;
    }
}

// leetcode == https://leetcode.com/problems/linked-list-cycle-ii/