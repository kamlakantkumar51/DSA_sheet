import java.util.*;
class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxlucky = -1;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }else{
                map.put(arr[i],1);
            }
        }

        for(Integer num:map.keySet()){
            if(map.get(num).intValue() == num.intValue()){
                maxlucky = Math.max(maxlucky,num);
            }
        }
        return maxlucky;
    }
}
