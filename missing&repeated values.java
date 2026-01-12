class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> map = new HashMap<>();

        //frequency count
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int val = grid[i][j];
                map.put(val,map.getOrDefault(val,0)+1);
            }
        }
        //creating array
        int ans[] = new int[2];
        int n = grid.length;
        int total = n * n;
        //missing & repeating value
        for(int i=1;i<=total;i++){
            if(!map.containsKey(i)){
                ans[1] = i;
            }else if(map.get(i) == 2){
                ans[0] = i;
            }
        }
        return ans;
    }
}
