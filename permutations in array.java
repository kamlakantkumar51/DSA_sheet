import java.util.Arrays;
class Solution {
    public boolean isPossible(int k, int[] arr1, int[] arr2) {
        // Your code goes here.
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int n = arr1.length;
        for(int i=0;i<arr1.length;i++){
                if(arr1[i]+arr2[n-1-i]<k){
                    return false;
                }
        }
        return true;
    }
}
