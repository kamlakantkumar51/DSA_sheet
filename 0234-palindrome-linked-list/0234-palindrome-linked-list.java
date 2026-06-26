class Solution {
    private ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        //step1:find the mid of the linkedlist
        if(head == null && head.next == null){
            return true;
        }
        //step2:reverse the list from the mid of the list
        ListNode mid = findMid(head);
        ListNode prev = null;
        ListNode curr = mid;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //step3:compare with other parts
        ListNode right = prev;
        ListNode left = head;
        while(right != null){
            if(left.val != right.val){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
}