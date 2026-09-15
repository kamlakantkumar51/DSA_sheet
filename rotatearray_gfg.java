class Solution {
    public void rotateArr(int arr[], int d) {
        // code here
        int n = arr.length;
        d = d%n;
        int ans[] = new int[n];
        
        for(int i=0;i<n;i++){
            ans[i] = arr[(i+d)%n];
        }
        
        for(int i=0;i<n;i++){
            arr[i] = ans[i];
        }
    }
}
