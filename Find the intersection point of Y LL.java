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
        if(headA == null || headB == null) return null;
        ListNode left = headA;
        ListNode right = headB;
        while(left!= right){
            left = (left == null)?headB:left.next;
            right = (right == null) ? headA:right.next;
        }
        return left;
    }
}
