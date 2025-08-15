/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        
        // code here.
        if(head == null)return 0;
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return length(slow);
            }
        }
        return 0;
    }
    private int length(Node node){
        int count = 1;
        Node temp = node.next;
        
        while(temp!= node){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
