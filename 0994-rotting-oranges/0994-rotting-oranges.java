class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean changed;
        int currTime = 0;
        int dirr[][] = {
            {1,0},{0,1},{-1,0},{0,-1}
        };
        while(true){
            changed = false;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(grid[i][j] == currTime + 2){
                        for(int dir[]:dirr){
                            int x = i+ dir[0];
                            int y = j+ dir[1];
                            if(isSafe(x,y,n,m) && grid[x][y] == 1){
                                grid[x][y] = grid[i][j]+1;
                                changed = true;
                            }
                        }
                    }
                }
            }
            if(!changed){
                break;
            }
            currTime++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    return -1;
                }
            }
        }
        return currTime;
    }
    private boolean isSafe(int i,int j,int n,int m){
        return 0<=i && i<n && 0<=j && j<m;
    }
}