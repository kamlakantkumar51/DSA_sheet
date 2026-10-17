class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visited[] = new boolean[rooms.size()];
        dfs(0,visited,rooms);
        for(boolean v:visited){
            if(!v){
                return false;
            }
        }
        return true;
    }
    private void dfs(int node,boolean visited[],List<List<Integer>> rooms){
        visited[node] = true;
        for(int key:rooms.get(node)){
            if(!visited[key]){
                dfs(key,visited,rooms);
            }
        }
    }
}