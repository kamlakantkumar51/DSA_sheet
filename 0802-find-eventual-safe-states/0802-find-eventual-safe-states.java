
import java.util.*;

class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        // Step 1: Create reverse graph
        List<List<Integer>> reversegraph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            reversegraph.add(new ArrayList<>());
        }
        // Step 2: Calculate outdegree
        int[] indegree = new int[n];
        for (int node = 0; node < n; node++) {
            for (int neighbour : graph[node]) {
                reversegraph.get(neighbour).add(node);
                indegree[node]++;
            }
        }
        // Step 3: Add terminal nodes to queue
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }
        // Step 4: Apply BFS
        boolean[] safe = new boolean[n];
        while (!q.isEmpty()) {
            int node = q.poll();
            safe[node] = true;
            for (int prev : reversegraph.get(node)) {
                indegree[prev]--;
                if (indegree[prev] == 0) {
                    q.offer(prev);
                }
            }
        }
        // Step 5: Collect safe nodes
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (safe[i]) {
                ans.add(i);
            }
        }
        return ans;
    }
}
