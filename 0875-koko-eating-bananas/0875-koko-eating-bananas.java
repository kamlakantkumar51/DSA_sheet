class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = getMax(piles);

        while(low < high){
            int mid = (low+high)/2;
            if(canEatAll(piles,h,mid)){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    private int getMax(int piles[]){
        int max = 0;
        for(int pile:piles){
            max = Math.max(max,pile);
        }
        return max;
    }
    private boolean canEatAll(int piles[],int h,int k){
        int totalhours = 0;
        for(int pile :piles){
            totalhours += (pile + k-1)/k;
        }
        return totalhours <= h;
    }
}