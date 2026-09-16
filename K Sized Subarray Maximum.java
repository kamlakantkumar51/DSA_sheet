import java.util.*;
class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        
        int n = arr.length;
        for(int i=0;i<n;i++){
            //step1:Remove element outside the current sliding window 
            
            if(!deque.isEmpty() && deque.peekFirst() <= i-k){
                deque.pollFirst();
            }
            
            //step2:remove smaller elements in the deque from the back
            while(!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]){
                deque.pollLast();
            }
            
            //step3:add current index
            deque.addLast(i);
            //step4:The front of the deque is the maximum of the current window
            if(i >= k-1){
                ans.add(arr[deque.peekFirst()]);
            }
        }
        return ans;
    }
}
