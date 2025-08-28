class Solution {
    private static final long MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {
        long evenchoices = 5;
        long oddchoices = 4;
        
        long evenpos = (n+1)/2;
        long oddpos = n/2;

        long poweven = pow(evenchoices,evenpos);
        long powodd = pow(oddchoices,oddpos);

        long total = (poweven * powodd) %MOD;
        
        return (int)total;

    }
    private long pow(long base, long exp) {
        if (exp == 0) return 1;
        long half = pow(base, exp / 2);
        long result = (half * half) % MOD;
        if (exp % 2 == 1) {
            result = (result * base) % MOD;
        }
        return result;
    }
}
