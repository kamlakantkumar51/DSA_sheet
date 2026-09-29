class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int m = mat.length;
        int n = mat[0].length;

        int start = 0;
        int end = m*n-1;

        while(start <= end){
            int mid = (start)+(end-start)/2;

            int row = mid/n;
            int col = mid%n;
            int val = mat[row][col];
            if(val == x){
                return true;
            }else if( val < x){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }
}
