class Solution {
    class Pair{
        int row;
        int col;
        int dist;

        Pair(int row,int col,int dist){
            this.row = row;
            this.col = col;
            this.dist = dist;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if(grid[0][0] == 1 || grid[n-1][n-1] == 1){
            return -1;
        }
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(0,0,1));
        grid[0][0] = 1;
        int dir[][] = {
    {-1,-1},{-1,0},{-1,1},
    {0,-1},{0,1},
        {1,-1},{1,0},{1,1}
        };
        while(!q.isEmpty()){
            Pair curr = q.poll();
            int row = curr.row;
            int col = curr.col;
            int dist = curr.dist;

            if(row == n-1 && col == n-1)return dist;
            for(int d[]:dir){
                int newRow = row+d[0];
                int newCol = col+d[1];
                if(newRow >= 0 && newCol >= 0 && newRow < n && newCol < n && grid[newRow][newCol] == 0){
                    grid[newRow][newCol] = 1;
                    q.offer(new Pair(newRow,newCol,dist+1));
                }
            }
        }
        return -1;
    }
}