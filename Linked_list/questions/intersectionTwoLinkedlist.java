/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a = size(headA);
        int b = size(headB);

        ListNode temp1 = headA;
        ListNode temp2 = headB;

        if(a > b){
            int end = a - b;
            for(int i=1;i<=end;i++){
                temp1 = temp1.next;
            }
        }
        else{
            int end = b - a;
            for(int i=1;i<=end;i++){
                temp2 = temp2.next;
            }
        }

        while(temp1 != temp2 && temp1 != null){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return temp1;
    }


    static int size(ListNode head){
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
}

// solution... of leetcode ==== https://leetcode.com/problems/intersection-of-two-linked-lists/
