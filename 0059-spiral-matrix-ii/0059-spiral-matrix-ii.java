class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];

        int startRow = 0;
        int startCol = 0;
        int endRow = n-1;
        int endCol = n-1;
        int num = 1;
        while(startRow <= endRow && startCol <= endCol){
            //top part
            for(int i=startCol;i <= endCol;i++){
                matrix[startRow][i] = num++;
            }
            startRow++;
            //right part
            for(int i= startRow;i <= endRow;i++){
                matrix[i][endCol] = num++;
            }
            endCol--;

            //bottom part
            if(startRow <= endRow){
                for(int i=endCol;i >= startCol;i--){
                matrix[endRow][i] = num++;
            }
            endRow--;
            }
            //left part
            if(startCol<= endCol){
                for(int i= endRow;i >= startRow;i--){
                matrix[i][startCol] = num++;
            }
            startCol++;
            }
        }
        return matrix;
    }
}