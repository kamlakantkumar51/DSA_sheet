class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int visited[] = new int[n];
        int count = 0;
        for(int i=0;i<n;i++){
            if(visited[i] == 0){
                dfs(i,visited,isConnected);
                count++;
            }
        }
        return count;
    }
    private void dfs(int node,int visited[],int isConnected[][]){
        visited[node] = 1;
        for(int i=0;i<isConnected.length;i++){
            if(isConnected[node][i] == 1 && visited[i] == 0){
                dfs(i,visited,isConnected);
            }
        }
    }

}