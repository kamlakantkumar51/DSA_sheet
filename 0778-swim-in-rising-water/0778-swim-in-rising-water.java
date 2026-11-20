import java.util.*;
class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        boolean visited[][] = new boolean[n][n];
        PriorityQueue<int[]>pq = new PriorityQueue<>(
            (a,b) -> a[0]-b[0]
        );
        pq.offer(new int[]{grid[0][0],0,0});
        int directions[][] = {
            {1,0},
            {-1,0},
            {0,1},
            {0,-1}
        };
        while(!pq.isEmpty()){
            int current[] = pq.poll();
            int time = current[0];
            int row = current[1];
            int  col = current[2];
            if(visited[row][col]){
                continue;
            }
            visited[row][col] = true;
            if(row == n-1 && col == n-1){
                return time;
            }
            for(int dir[]:directions){
                int newrow = row+dir[0];
                int newcol = col+dir[1];
                if(newrow <0 || newrow >= n || newcol < 0 || newcol >= n || visited[newrow][newcol]){
                    continue;
                }
                int newtime = Math.max(time,grid[newrow][newcol]);
                pq.offer(new int[]{newtime,newrow,newcol});
            }
        }
        return -1;
    }
}