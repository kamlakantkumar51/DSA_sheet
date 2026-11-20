import java.util.*;
class Solution {
    public int minimumEffortPath(int[][] heights) {

        int m = heights.length;
        int n = heights[0].length;
        int[][] dist = new int[m][n];

        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        dist[0][0] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        // {effort, row, col}
        pq.offer(new int[]{0, 0, 0});
        int[][] directions = {
            {0, 1}, {0, -1}, {-1, 0}, {1, 0}
        };
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int effort = current[0];
            int row = current[1];
            int col = current[2];
            if (effort > dist[row][col]) {
                continue;
            }
            if (row == m - 1 && col == n - 1) {
                return effort;
            }
            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                if (newRow < 0 || newRow >= m ||
                    newCol < 0 || newCol >= n) {
                    continue;
                }
                int edgeEffort = Math.abs(
                    heights[row][col] - heights[newRow][newCol]
                );
                int newEffort = Math.max(effort, edgeEffort);
                if (newEffort < dist[newRow][newCol]) {
                    dist[newRow][newCol] = newEffort;
                    pq.offer(new int[]{
                        newEffort, newRow, newCol
                    });
                }
            }
        }
        return 0;
    }
}
