int n = arr.length;
        boolean dp[][] = new boolean[n+1][sum+1];

        //i means item and j means target sum
        for(int i=0;i<=n;i++){
            dp[i][0] = true;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                int v = arr[i-1];
                //include
                if(v <= j && dp[i-1][j-v] == true){
                    dp[i][j] = true;
                }
                //exclude
                else if(dp[i-1][j] == true){
                    dp[i][j] = true;
                }
            }
        }
        print(dp);
        return dp[n][sum];
