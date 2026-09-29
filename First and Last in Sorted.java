import java.util.*;
class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(findbound(arr,x,true));
        ans.add(findbound(arr,x,false));
        return ans;
    }
    private int findbound(int arr[],int x,boolean issafe){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        
        while(start <= end){
            int mid = (start)+ (end-start)/2;
            if(arr[mid] == x){
                ans = mid;
                if(issafe){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else if(arr[mid] < x){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
    
}
