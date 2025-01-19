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
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;         // exception handle
        if(head.next == null) return false;     // exception handle
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null){
            if(slow == null) return false;      // exception handle
            slow = slow.next;
            if(fast.next == null) return false;    // exception handle
            fast = fast.next.next;
            if(fast == slow) return true;
        }

        return false;
    }
}

// leetcode ===  https://leetcode.com/problems/linked-list-cycle/