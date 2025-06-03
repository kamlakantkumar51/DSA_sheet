// Input: arr = [3, 4, 1, 9, 56, 7, 9, 12], m = 5
// Output: 6
import java.util.*;
class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        
        Collections.sort(arr);
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<=arr.size()-m;i++){
            int minElement = arr.get(i);
            int maxElement = arr.get(i+m-1);
            int diff = maxElement-minElement;
            
            ans = Math.min(ans,diff);
        }
        return ans;
    }
}
