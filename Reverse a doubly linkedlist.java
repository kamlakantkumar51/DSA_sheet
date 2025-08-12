class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        if (head == null || head.next == null) return head;
        DLLNode curr = head;
        DLLNode prev = null;
        while (curr != null) {
            DLLNode temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            prev = curr;
            curr = curr.prev;
        }
        return prev;
    }
}
