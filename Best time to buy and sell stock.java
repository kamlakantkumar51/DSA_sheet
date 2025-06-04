class Solution {
    public int maxProfit(int[] prices) {
        // Input: prices = [7,1,5,3,6,4]
        // Output: 5
        int bp = Integer.MAX_VALUE;//bp = buying price
        int maxprofit = 0;

        for(int i=0;i<prices.length;i++){
            if(bp<prices[i]){
                int profit = prices[i]-bp;
                maxprofit = Math.max(maxprofit,profit);
            }else{
                bp = prices[i];
            }
        }
        return maxprofit;

    }
}
