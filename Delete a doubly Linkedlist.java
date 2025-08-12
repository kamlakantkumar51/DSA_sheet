/*
Definition for doubly Link List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/

class Solution {
    public Node deleteNode(Node head, int x) {
        if (head == null || x <= 0) {
            return head;
        }
        Node temp = head;
        //case1:deleting head node...
        if (x == 1) {
            head = temp.next;
            if (head != null) {
                head.prev = null;
            }
            return head;
        }

        // Case 2: Delete non-head node
        for (int i = 1; temp != null && i < x; i++) {
            temp = temp.next;
        }

        // If x is greater than number of nodes
        if (temp == null) {
            return head;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }

        return head;
    }
}
