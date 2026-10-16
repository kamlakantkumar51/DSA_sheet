class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int price:prices){
            minPrice = Math.min(minPrice,price);
            maxprofit = Math.max(maxprofit,price-minPrice);
        }
        return maxprofit;
    }
}