class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        
        int min = arr[0];//for minimum variable
        int max = arr[0];//for mnaximum variable
        
        for(int i=0;i<arr.length;i++){
            min = Math.min(min,arr[i]);//inbuilt function for finding the minimum element
            max = Math.max(max,arr[i]);//.................................maximum element
        }
        
         return new Pair(min,max);
        
    }
}
