
class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n * n + 1];

        q.offer(1);
        visited[1] = true;

        int moves = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int node = q.poll();

                if (node == n * n) {
                    return moves;
                }

                for (int curr = 1; curr <= 6; curr++) {
                    int next = node + curr;

                    if (next > n * n) {
                        break;
                    }

                    int[] pos = getposition(next, n);
                    int row = pos[0];
                    int col = pos[1];

                    if (board[row][col] != -1) {
                        next = board[row][col];
                    }

                    if (!visited[next]) {
                        q.offer(next);
                        visited[next] = true;
                    }
                }
            }
            moves++;
        }

        return -1;
    }

    private int[] getposition(int num, int n) {
        int row = n - 1 - (num - 1) / n;
        int col = (num - 1) % n;

        if ((n - row) % 2 == 0) {
            col = n - 1 - col;
        }

        return new int[]{row, col};
    }
}
