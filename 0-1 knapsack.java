import java.util.*;
class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n = val.length;
        int dp[][] = new int[n+1][W+1];
        
        for(int i=0;i<=n;i++){
            for(int j=0;j<=W;j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }else if(wt[i-1]<=j){//include part
                    dp[i][j] = Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
                }else{//exclude part
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
}
