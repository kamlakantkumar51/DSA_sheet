class Solution {
    public long countCommas(long n) {
        long totalcommas = 0;
        long start = 1000;

        while( n >= start){
            totalcommas += (n-start+1);
            if(start > Long.MAX_VALUE/1000){
                break;
            }
            start *= 1000;
        }
        return totalcommas;
    }
}