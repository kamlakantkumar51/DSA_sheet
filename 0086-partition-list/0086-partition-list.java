class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null)return null;

        List<Integer> list = new ArrayList<>();

        ListNode curr = head;
        while(curr!= null){
            if(curr.val < x){
                list.add(curr.val);
            }
            curr = curr.next;
        }//[1,1,2]

        curr = head;
        while(curr != null){
            if(curr.val >= x){
                list.add(curr.val);
            }
            curr = curr.next;
        }//[1,2,2,4,3,5]

        curr = head;
        while(curr != null){
            int index = 0;
            while(curr!= null){
                curr.val = list.get(index++);
                curr = curr.next;
            }
        }
        return head;
    }
}