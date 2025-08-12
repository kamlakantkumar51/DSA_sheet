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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr!= null){
            ListNode next = curr.next;//storing next
            curr.next = prev;//reverse list
            prev = curr;//moving prev forward
            curr = next;//moving curr forward
        }
        return prev;//return reversed linkedlist
    }
}
