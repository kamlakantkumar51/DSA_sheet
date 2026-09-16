class Solution {
    public int totalElements(int[] arr) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int n = arr.length;
        int left = 0;
        int maxlength = 0;
        
        for(int right = 0;right<n;right++){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);
            
           if (map.size() > 2) {
               map.put(arr[left], map.getOrDefault(arr[left],0) - 1);
               if (map.get(arr[left]) == 0) {
                   map.remove(arr[left]);
               }
               left++;
           }
            maxlength = Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}
