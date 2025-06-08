//brute force approach

class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        // Your code here
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;
        
    }
}

//optimal solution

class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        // Input: arr[] = [7, 9, 1, 3, 5], target = 6
        // Output: true
        
        //step1: find pivot point
        int n = arr.length;
        int pivot = -1;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot ==-1)
            pivot = n-1;
        
        //step2:intiliazing two pointer
        int left = (pivot+1)%n;
        int right = pivot;
        while(left!= right){
            int sum = arr[left]+arr[right];
            if(sum == target){
                return true;
            }else if(sum<target)
                left = (left+1)%n;
            else
                right = (right-1+n)%n;
        }
        return false;
    }
}

