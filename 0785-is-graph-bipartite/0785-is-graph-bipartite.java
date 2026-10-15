class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int visited[] = new int[n];

        for(int i=0;i<n;i++){
            if(visited[i] != 0){
                continue;
            }
            Queue<Integer> q = new LinkedList<>();
            q.offer(i);
            visited[i] = 1;

            while(!q.isEmpty()){
                int node = q.poll();
                for(int neigh:graph[node]){
                    if(visited[neigh] == 0){
                        visited[neigh] = -visited[node];
                        q.offer(neigh);
                    }else if(visited[neigh] == visited[node]){
                        return false;
                    }
                }
            }

        }
        return true;
    }
}