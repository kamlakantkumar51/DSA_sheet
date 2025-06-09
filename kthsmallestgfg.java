// brute force approach..

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[k-1];
        
    }
}

//optimal approach
import java.util.*;

class Solution {
    public int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> ans = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            ans.add(arr[i]);
            if (ans.size() > k) {
                ans.poll();
            }
        }

        return ans.peek(); 
    }
}

