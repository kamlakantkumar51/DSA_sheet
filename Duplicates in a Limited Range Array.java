import java.util.*;
class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        
        for(int num:map.keySet()){
            if(map.get(num) > 1){
                ans.add(num);
            }
        }
        
        return ans;
    }
}
