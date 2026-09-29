class Solution {
    public double medianOf2(int a[], int b[]) {
        // Code Here
        int m = a.length;
        int n = b.length;
        
        int merged[] = new int[m+n];
        
        int i=0,j=0,k=0;
        
        while(i < m && j < n){
            if(a[i] <= b[j]){
                merged[k++] = a[i++];
            }else{
                merged[k++] = b[j++];
            }
        }
        
        while(i < m){
            merged[k++] = a[i++];
        }
        
        while(j < n){
            merged[k++] = b[j++];
        }
        
        if((m+n)%2 == 0){
            return (merged[(m+n)/2-1] + merged[(m+n)/2])/2.0;
        }
        else{
            return (merged[(m+n)/2]);
        }
    }
}
