//bruteforce approach counting approach
/* class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class Solution {
    static Node segregate(Node head) {
        // code here
        if(head == null || head.next == null) return head;
        //step1:counting kr rha hu..
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        Node curr = head;
        while(curr!= null){
            if(curr.data == 0) count0++;
            else if(curr.data == 1) count1++;
            else count2++;
            curr = curr.next;
        }
        //node value ko overwrite kar rha hu
        curr = head;
        while(count0-- >0){
            curr.data = 0;
            curr = curr.next;
        }
        while(count1-- >1){
            curr.data = 1;
            curr = curr.next;
        }
        while(count2-- >2){
            curr.data = 2;
            curr = curr.next;
        }
        return head;
    }
}
//two pointer approach
