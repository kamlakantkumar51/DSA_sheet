import java.util.*;
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a,b)-> a.val-b.val
        );
        for(ListNode node:lists){
            if(node!= null){
                pq.offer(node);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(!pq.isEmpty()){
            ListNode minnode = pq.poll();
            tail.next = minnode;
            tail = tail.next;

            if(minnode.next!= null){
                pq.offer(minnode.next);
            }
        }
        return dummy.next;
        
    }
}