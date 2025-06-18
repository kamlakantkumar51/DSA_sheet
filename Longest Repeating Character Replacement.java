// Input: s = "ABAB", k = 2
// Output: 4
// Explanation: Replace the two 'A's with two 'B's or vice versa.
//bruteforce approach
class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxlength = 0;

        for(int i=0;i<n;i++){
            int freq[] = new int[26];
            int maxfreq = 0;
            for(int j = i;j<n;j++){
                freq[s.charAt(j)-'A']++;
                maxfreq = Math.max(maxfreq,freq[s.charAt(j)-'A']);

                int lengthofsubstr = j-i+1;
                int replacingcharac = lengthofsubstr - maxfreq;

                if(replacingcharac <= k){
                    maxlength = Math.max(maxlength,lengthofsubstr);
                }
            }
        }
        return maxlength;
    }
}
//optimal solution
class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int maxFreq = 0;
        int start = 0;
        int ans = 0;
        for (int end = 0; end < s.length(); end++) {
            freq[s.charAt(end) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(end) - 'A']);

            int windowSize = end - start + 1;
            int toReplace = windowSize - maxFreq;

            if (toReplace > k) {
                freq[s.charAt(start) - 'A']--; 
                start++;
            }
            ans = Math.max(ans, end - start + 1);
        }
        return ans;
    }
}
