/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null ){
            return true;
        }
        //1st step: find mid
        ListNode mid = findmid(head);
        //2nd step:reverse second half part
        ListNode prev = null;
        ListNode curr = mid;
        ListNode next;

        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode right = prev;
        ListNode left = head;
        //step3:comparing first and second half
        while(right!= null){
            if(left.val!= right.val){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    private ListNode findmid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
