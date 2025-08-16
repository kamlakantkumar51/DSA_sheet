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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenNode = even;
        while(even!= null && even.next!= null){
            odd.next = even.next;//adding odd to the next odd
            odd = odd.next;

            even.next = odd.next;//adding even to the next even
            even = even.next;
        } 
        odd.next = evenNode;//adding even after odd
        return head;
    }
}
