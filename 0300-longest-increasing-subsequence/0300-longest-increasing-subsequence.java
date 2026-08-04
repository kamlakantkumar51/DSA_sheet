import java.util.*;
class Solution {
    public int lengthOfLIS(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int nums2[] = new int[set.size()];
        int i=0;
        for(int num:set){
            nums2[i++] = num;
        }
        Arrays.sort(nums2);
        return lis(nums,nums2);
    }
    private static int lis(int nums1[],int nums2[]){
        int m = nums1.length;
        int n = nums2.length;
        int dp[][] = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }else if(nums1[i-1] == nums2[j-1]){
                    dp[i][j] = 1+dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}