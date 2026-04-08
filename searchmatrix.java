class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int start = 0;
        int end = m*n-1;

        while(start <= end){
            int mid = (start)+(end-start)/2;
            int row = mid/n;
            int col = mid%n;
            int values = matrix[row][col];

            if(values == target){
                return true;
            }else if( values < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }
}
