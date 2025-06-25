class Solution {
    int longestPrefixSuffix(String s) {
        if (s == null || s.isEmpty()) return 0;
        int n = s.length();
        int[] lengthps = new int[n];
        int len = 0;
        int i = 1;
        
        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lengthps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lengthps[len - 1];
                } else {
                    lengthps[i] = 0;
                    i++;
                }
            }
        }
        return lengthps[n - 1];
    }
}
